import java.util.Scanner;

public class Q6_LargestSecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;
        long temp = number;

        while (temp != 0) {
            if (index == maxDigit) {
                break;
            }
            digits[index++] = (int)(temp % 10);
            temp /= 10;
        }

        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        sc.close();
    }
}
