import java.util.Scanner;

public class Q3_CharArrayCompare {
    public static char[] getChars(String s) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        return arr;
    }

    public static boolean compareArrays(char[] a1, char[] a2) {
        if (a1.length != a2.length) return false;
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        char[] manual = getChars(text);
        char[] builtIn = text.toCharArray();
        boolean result = compareArrays(manual, builtIn);
        System.out.println("Manual array: " + new String(manual));
        System.out.println("Built-in array: " + new String(builtIn));
        System.out.println("Both arrays equal: " + result);
    }
}
