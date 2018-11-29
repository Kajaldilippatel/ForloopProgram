import java.util.Scanner;

//Program to print multiplication table
public class MulNum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print(" Enter no to print multiplication table : ");
        int num=scanner.nextInt();
         for(int j=1;j<=10;j++){
             System.out.println(num + " * " + j + " = " + (num*j));
         }
     }
}

