import java.util.*;

public class Q5_VowelConsonant {
    static String checkChar(char c) {
        if(c>='A'&&c<='Z') c=(char)(c+32);
        if(c>='a'&&c<='z')
            return "aeiou".indexOf(c)>=0 ? "Vowel" : "Consonant";
        return "Not a Letter";
    }
    static String[][] analyze(String s) {
        String[][] res=new String[s.length()][2];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            res[i][0]=String.valueOf(c);
            res[i][1]=checkChar(c);
        }
        return res;
    }
    static void display(String[][] d){
        System.out.printf("%-10s %-15s%n","Char","Type");
        for(String[] row:d)
            System.out.printf("%-10s %-15s%n",row[0],row[1]);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        display(analyze(text));
    }
}
