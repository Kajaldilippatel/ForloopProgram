//Program to Divisible by 3 and 5
import java.util.Scanner;

public class NumDivi{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print(" Enter No for loop : ");
        int num=scanner.nextInt();
        printPattern(num);
    }
    public static void printPattern(int num){
        int i;
        System.out.println(" Number divisible by 3 is : ");
        for(i=1;i<=num;i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
        System.out.println(" Number divisible ny 5 is : " );
        for(i=1;i<=num;i++){
            if(i%5==0){
                System.out.println(i);
        }}
    }
}
