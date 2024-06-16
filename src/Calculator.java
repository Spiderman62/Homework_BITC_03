import java.util.Scanner;

public class Calculator {
    private int sum = 0;

    public int calculateSum() {
        Scanner keydown = new Scanner(System.in);

        while (true) {
            System.out.print("Nhập số nguyên (nhập 'n' để dừng): ");
            String input = keydown.nextLine();
            if (input.equalsIgnoreCase("n")) {
                break;
            }
            try {
                int number = Integer.parseInt(input);
                this.sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Dữ liệu nhập vào không hợp lệ. Vui lòng nhập số nguyên.");
            }
        }
        return this.sum;
    }
    public int calculateSumOfProduct(int n) {
        System.out.print("Biểu thức: ");
        for (int i = 1; i <= n; i++) {
            int product = 1;
            for (int j = 1; j <= i; j++) {
                product *= j;
                if (j == i) {
                    System.out.print(product);
                } else {
                    System.out.print(product + " + ");
                }
            }
            this.sum += product;
        }
        System.out.println();
        return this.sum;
    }
    public void printPrimeFactors(int n) {
        System.out.print("Các thừa số nguyên tố của " + n + " là: ");

        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }

        if (n > 2) {
            System.out.print(n);
        }

        System.out.println();
    }
}
