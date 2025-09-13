import java.util.*;

public class Q2_RPS {
    static String comp() {
        return new String[]{"rock","paper","scissors"}[(int)(Math.random()*3)];
    }
    static String win(String u,String c) {
        if(u.equals(c)) return "Draw";
        if(u.equals("rock")&&c.equals("scissors")||
           u.equals("paper")&&c.equals("rock")||
           u.equals("scissors")&&c.equals("paper")) return "User";
        return "Comp";
    }
    public static void main(String[] a) {
        Scanner sc=new Scanner(System.in);
        int g=sc.nextInt(),uw=0,cw=0,d=0;
        System.out.printf("%-5s %-8s %-8s %-6s%n","Game","User","Comp","Win");
        for(int i=1;i<=g;i++){
            String u=sc.next().toLowerCase(),c=comp(),w=win(u,c);
            if(w.equals("User"))uw++; else if(w.equals("Comp"))cw++; else d++;
            System.out.printf("%-5d %-8s %-8s %-6s%n",i,u,c,w);
        }
        System.out.println("\nStats:");
        System.out.printf("User: %d (%.2f%%)%n",uw,uw*100.0/g);
        System.out.printf("Comp: %d (%.2f%%)%n",cw,cw*100.0/g);
        System.out.println("Draws: "+d);
    }
}
