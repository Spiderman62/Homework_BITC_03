import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public void calculatorSum(){

    }
    public static void main(String[] args) {
        Main main = new Main();
        Calculator calculator = new Calculator();

        int type;
        Scanner system = new Scanner(System.in);
        System.out.println("1: Calculator Sum");
        System.out.println("2: Calculator sum of product");
        System.out.println("3: Find prime factors");
        System.out.print("Please enter the number above to perform programmer: ");
        if (system.hasNextInt()) {
            type = system.nextInt();
            switch (type) {
                case 1:
                    int result = calculator.calculateSum();
                    System.out.println("Tổng các số là: " + result);
                    break;
                case 2:

                    int resultProduct = calculator.calculateSumOfProduct(5);
                    System.out.println("Tổng của biểu thức là: " + resultProduct);
                    break;
                case 3:
                    calculator.printPrimeFactors(60);
                    break;

                default:
                    System.out.println("Maintenance");
            }
        } else {
            System.out.println("Must be a number!!!");
        }
    }
}