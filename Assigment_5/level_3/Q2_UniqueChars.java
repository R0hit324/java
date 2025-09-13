import java.util.*;

public class Q2_UniqueChars {
    static int getLen(String s){
        int c=0; try{while(true){s.charAt(c); c++;}}catch(Exception e){}
        return c;
    }
    static char[] findUnique(String s){
        int n=getLen(s),k=0;
        char[] temp=new char[n];
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            boolean unique=true;
            for(int j=0;j<i;j++)
                if(s.charAt(j)==ch) unique=false;
            if(unique) temp[k++]=ch;
        }
        return Arrays.copyOf(temp,k);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        char[] res=findUnique(text);
        System.out.println("Unique Characters: "+Arrays.toString(res));
    }
}
