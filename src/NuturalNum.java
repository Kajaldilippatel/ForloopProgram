//To print sum of 10 natural Number
public class NuturalNum {
    public static void main(String[] args) {
        int sum=0;
        for(int j=1;j<=10;j++) {
            sum+=j;
            System.out.print(j + " + ");
        }
            System.out.println(".......Sum of 10 natural number is : "+ sum);

    }
}
