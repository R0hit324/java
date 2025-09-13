import java.util.*;

public class Q4_CharFrequency {
    static String[][] findFrequency(String s){
        int[] freq=new int[256];
        for(int i=0;i<s.length();i++) freq[s.charAt(i)]++;
        String[][] result=new String[s.length()][2];
        int k=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(freq[c]>0){
                result[k][0]=String.valueOf(c);
                result[k][1]=String.valueOf(freq[c]);
                freq[c]=0;
                k++;
            }
        }
        return Arrays.copyOf(result,k);
    }
    static void display(String[][] arr){
        System.out.println("Char\tFreq");
        for(String[] row:arr) System.out.println(row[0]+"\t"+row[1]);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        String[][] freq=findFrequency(text);
        display(freq);
    }
}
