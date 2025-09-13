import java.util.*;

public class Q1_StudentScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Random r = new Random();
        System.out.printf("%-8s %-8s %-8s %-8s %-8s %-10s %-10s %-6s%n",
                "Stu","Phy","Chem","Math","Total","Average","Percent","Grade");
        for (int i = 1; i <= n; i++) {
            int phy = 10 + r.nextInt(90);
            int chem = 10 + r.nextInt(90);
            int math = 10 + r.nextInt(90);
            int total = phy + chem + math;
            double avg = Math.round((total / 3.0) * 100.0) / 100.0;
            double per = avg;
            String grade = per >= 90 ? "A+" : per >= 80 ? "A" : per >= 70 ? "B+" :
                           per >= 60 ? "B" : per >= 50 ? "C" : per >= 40 ? "D" : "F";
            System.out.printf("%-8d %-8d %-8d %-8d %-8d %-10.2f %-10.2f %-6s%n",
                    i, phy, chem, math, total, avg, per, grade);
        }
    }
}

