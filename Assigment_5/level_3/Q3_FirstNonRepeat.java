import java.util.*;

public class Q3_FirstNonRepeat {
    static char firstNonRepeating(String s){
        int[] freq=new int[256];
        for(int i=0;i<s.length();i++) freq[s.charAt(i)]++;
        for(int i=0;i<s.length();i++)
            if(freq[s.charAt(i)]==1) return s.charAt(i);
        return '_';
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        char res=firstNonRepeating(text);
        System.out.println("First Non-Repeating Character: "+res);
    }
}
