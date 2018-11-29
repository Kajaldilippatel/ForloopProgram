//Find cube for given integer
import java.util.Scanner;
public class CubeNum {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print(" Enter number to find cube  : ");
        int no=scanner.nextInt();
        for(int i=1;i<=no;i++){
            int j=(i*i*i);
            System.out.println(" Cube of  no"+i + " is : "+j);
        }
    }
}
