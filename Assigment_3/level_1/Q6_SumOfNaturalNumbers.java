import java.util.Scanner;

class Q6_SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sumLoop = 0;
        for (int i = 1; i <= n; i++) {
            sumLoop += i;
        }

        int sumFormula = n * (n + 1) / 2;

        System.out.println("Sum using for loop: " + sumLoop);
        System.out.println("Sum using formula: " + sumFormula);
    }
}
