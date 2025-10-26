import java.util.Scanner;
public class sum{
public  static void  main(String[] args) {
    Scanner sc = new Scanner  (System.in);

    int num;
    int choice;
    int evenSum= 0;
    int oddSum= 0;

    do{
        System.out.print("enter num: ");
        num = sc.nextInt();

        if(num % 2==0 ){
            evenSum += num;
        } else{
            oddSum += num;

        }
        System.out.print(" do you want to continue ? Press 1 for yes or 0 for no");
        choice =sc.nextInt();

        }while(choice==1);
        System.out.print("sum of even  no :" + evenSum);
         System.out.print("odd of even  no :" + oddSum);
        
    }
}

