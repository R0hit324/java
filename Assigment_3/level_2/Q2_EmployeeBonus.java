import java.util.Scanner;

class Q2_EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();
        int yearsOfService = sc.nextInt();

        double bonus = (yearsOfService > 5) ? salary * 0.05 : 0;
        System.out.println("The bonus amount is " + bonus);
    }
}
