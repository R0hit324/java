import java.util.*;

public class Q4_TrimSpaces {
    static int[] findBounds(String s) {
        int start=0,end=s.length()-1;
        while(start<s.length() && s.charAt(start)==' ') start++;
        while(end>=0 && s.charAt(end)==' ') end--;
        return new int[]{start,end};
    }
    static String subStr(String s,int st,int en) {
        String r="";
        for(int i=st;i<=en;i++) r+=s.charAt(i);
        return r;
    }
    static boolean compare(String a,String b) {
        if(a.length()!=b.length()) return false;
        for(int i=0;i<a.length();i++) if(a.charAt(i)!=b.charAt(i)) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        int[] b=findBounds(text);
        String manual=subStr(text,b[0],b[1]);
        String builtIn=text.trim();
        System.out.println("Manual: "+manual);
        System.out.println("Built-in: "+builtIn);
        System.out.println("Equal? "+compare(manual,builtIn));
    }
}
