import java.util.Scanner;

class MyCalculator {
    public long power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative");
        } else if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero");
        } else {
            long result = 1;
            for (int i = 1; i <= p; i++) {
                result *= n;
            }
            return result;
        }
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyCalculator calculator = new MyCalculator();
        int n = sc.nextInt();
        int p = sc.nextInt();
        try {
            long result1 = calculator.power(n, p);
            System.out.println("Result 1: " + result1);

            // long result2 = calculator.power(0, 5);
            // System.out.println("Result 2: " + result2);

            // long result3 = calculator.power(-4, 2); 
            // System.out.println("Result 3: " + result3);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
