//Print Star Pattern
import java.util.Scanner;
public class StarPattern {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print(" Enter No for print pattern : ");
        int num=scanner.nextInt();
        printPattern(num);
    }
    public static void printPattern(int num){
        int i,j;
        for(i=1;i<=num;i++){
            for(j=1;j<=i;j++)
            {
                System.out.print("*" + " ");

            }
            System.out.println();
        }
    }
}
