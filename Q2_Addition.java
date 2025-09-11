import java.util.Scanner;
public class Q2_Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of a:");
        int a = sc.nextInt(); 
        System.out.println("Enter value of b:");
        int b = sc.nextInt();
        int add = a+b;
        System.out.println("Addition of two numbers is:"+add);
    }
}
