import java.util.Scanner;

//To print fibonacci Series
public class FibonaSer {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print(" Enter no to print Fibonacci Series : ");
        int num=scanner.nextInt();
        int num1=0,num2=1,num3;
        for(int i=1;i<=num;i++){
            System.out.print(num1+ " ");
            num3=num1+num2;
            num1=num2;
            num2=num3;


        }
    }
}
