import java.util.Scanner;

public class Q5_CharacterFrequency {
    public static char[] uniqueCharacters(String text) {
        String u = "";
        for (int i = 0; i < text.length(); i++)
            if (u.indexOf(text.charAt(i)) == -1) u += text.charAt(i);
        return u.toCharArray();
    }

    public static String[][] characterFrequency(String text) {
        int[] f = new int[256];
        for (int i = 0; i < text.length(); i++) f[text.charAt(i)]++;
        char[] u = uniqueCharacters(text);
        String[][] res = new String[u.length][2];
        for (int i = 0; i < u.length; i++) {
            res[i][0] = u[i] + "";
            res[i][1] = f[u[i]] + "";
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] r = characterFrequency(sc.nextLine());
        for (String[] a : r) System.out.println(a[0] + " : " + a[1]);
        sc.close();
    }
}
