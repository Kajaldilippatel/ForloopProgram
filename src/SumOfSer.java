//To print sum of series 2+1/2+1/3.....+1/n
import java.util.Scanner;
public class SumOfSer {
    static double sum=0.0,temp;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print(" Enter no to print sum of series  : ");
        int num=scanner.nextInt();
        System.out.print(" 1 + ");
        for(int j=1;j<=num;j++) {
            temp = (float) 1 / j;
            sum = sum + temp;
            System.out.print( 1+"/"+j + " + " );
        }
        System.out.println();
            System.out.println(sum+ "   ");
        }
    }

