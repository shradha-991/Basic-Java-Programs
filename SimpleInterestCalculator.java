import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time : ");
        double time = sc.nextDouble();

        double si = (principal * rate * time) / 100;

        System.out.println("Simple Interest is: " + si);

        sc.close();
        
    }
}