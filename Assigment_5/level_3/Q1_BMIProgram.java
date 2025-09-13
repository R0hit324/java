import java.util.*;

public class Q1_BMIProgram {
    static String[] calc(double w,double h){
        double m=h/100.0;
        double bmi=w/(m*m);
        String status=bmi<18.5?"Underweight":bmi<25?"Normal":bmi<30?"Overweight":"Obese";
        return new String[]{String.valueOf(w),String.valueOf(h),
                            String.format("%.2f",bmi),status};
    }
    static String[][] process(double[][] hw){
        String[][] res=new String[hw.length][4];
        for(int i=0;i<hw.length;i++) res[i]=calc(hw[i][0],hw[i][1]);
        return res;
    }
    static void display(String[][] d){
        System.out.printf("%-8s %-8s %-8s %-12s%n","Weight","Height","BMI","Status");
        for(String[] r:d)
            System.out.printf("%-8s %-8s %-8s %-12s%n",r[0],r[1],r[2],r[3]);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double[][] hw=new double[10][2];
        for(int i=0;i<10;i++){
            hw[i][0]=sc.nextDouble();
            hw[i][1]=sc.nextDouble();
        }
        display(process(hw));
    }
}
