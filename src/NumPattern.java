//To print Number Pattern
import java.util.Scanner;
public class NumPattern {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print(" Enter No for print pattern : ");
        int num=scanner.nextInt();
        printPattern(num);
    }
    public static void printPattern(int num){
        int i,j,num1=1;
        for(i=1;i<=num;i++){
            for(j=1;j<=i;j++)
            {
                System.out.print(num1 + " ");
                num1=num1+1;
            }
            System.out.println();
        }
    }
}

