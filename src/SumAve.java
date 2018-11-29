//Program to find sum and average
import java.util.Scanner;
public class SumAve {
    static int num=5,total,ave;
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int num1;
        for(int i=1;i<=5;i++){
            System.out.print(" Enter no" + i + " : ");
            num1=scanner.nextInt();
            total+=num1;
        }
        System.out.println(" Total is : " + total);
        ave=total/5;
        System.out.println(" Average is : " + ave);

    }
}
