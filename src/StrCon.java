//Progran to Concatenate to String
import java.util.Scanner;
public class StrCon {
   // static String conStr;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter First String : ");
        String str1=scanner.next();
        System.out.print(" Enter Second String :" );
        String str2=scanner.next();
        str1=str1.concat(str2);
        System.out.print(" Full String is : "+ str1);
    }
}
