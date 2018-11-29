import java.util.Scanner;

//Program to find prime no
public class PrimeNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter No to find its prime or not : ");
        int num = scanner.nextInt();
        int ans = 0;
        if (num <= 1) {
            System.out.print(" Enter valid no ");
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    ans = 1;
                }
            }
            if (ans == 0) {
                System.out.print(" prime");
            } else {
                System.out.print(" Not Prime");
            }
        }
    }

    }

