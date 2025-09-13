import java.util.*;

public class Q3_VotingCheck {
    static int[] randomAges(int n) {
        Random r=new Random();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=10+r.nextInt(90);
        return a;
    }
    static String[][] checkVote(int[] a) {
        String[][] res=new String[a.length][2];
        for(int i=0;i<a.length;i++) {
            res[i][0]=String.valueOf(a[i]);
            res[i][1]=(a[i]>=18)?"true":"false";
            if(a[i]<0) res[i][1]="false";
        }
        return res;
    }
    static void display(String[][] d) {
        System.out.printf("%-8s %-10s%n","Age","CanVote");
        for(int i=0;i<d.length;i++)
            System.out.printf("%-8s %-10s%n",d[i][0],d[i][1]);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ages=randomAges(n);
        String[][] data=checkVote(ages);
        display(data);
    }
}
