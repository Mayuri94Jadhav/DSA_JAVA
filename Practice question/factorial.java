import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number to calculate its factorial: ");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers");
            sc.close();
            return;
        }
        long factorial = 1L;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        System.out.println("The factorial of " + num + " is: " + factorial);
        sc.close();
    }   
}