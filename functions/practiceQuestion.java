
// // FUNCTIONS QUESTIONS
// // Question 1 :Write a Java method to compute the average of three numbers
// public class practiceQuestion {
//     public static double averageOfThree(double a, double b, double c) {
//         return (a + b + c) / 3;
//     }

//     // public static void main(String[] args) {
//         double num1 = 5, num2 = 10, num3 = 15;
//         System.out.println("The average of " + num1 + ", " + num2 + ", and " + num3 + " is: " + averageOfThree(num1, num2, num3));
//     }
// // }

// // Question2: Write a method named isEven that accepts an int argument.The method should return true if the argument is even,or false otherwise.Alsowriteaprogramtotestyourmethod

// public class praticQuestion2{
//     public static void main(String []args){
//         Scanner sc =new Scanner(System.in);
//         it num;
//         System.out.print("enter num: ");
//         num = sc.nextInt();
//         if(isEven(num)) {
//             if(isEven(num)){
//                 System.out.println(num + " is even.");
//             } else {
//                 System.out.println(num + " is odd.");
//             }
//         }
//         public static boolean isEven(int number) {
//            if(number % 2 == 0) {
//                 return true;
//             } else {
//                 return false;
//             }   
//     }
// }
// }

// code to check palindrome num
// import java.util.*;

// public class practiceQuestion{
//     public static void main(String[] args) {
//         System.out.print("Enter a num :");
//     Scanner sc=new Scanner(System.in);
//     int palindrome =sc.nextInt();
//     if(isPalindrome(palindrome)){
//         System.out.println("num :" + palindrome + " is palindrome");
//     }else{
//         System.out.println("num :" + palindrome + " is   not palindrome");
//     }
//     }
//     public static boolean isPalindrome(int num){
//         int palindrome = num;
//         int reverse =0;
//         while(palindrome !=0){
//             int remainder = palindrome % 10;
//             reverse =reverse *10+remainder;
//             palindrome = palindrome/10;

//         }
//         if(num == reverse){
//             return true;
//               }

        
//         return false;
      

//     }
// }



// Question 5 :Write a Java method to compute the sum of the digits in an integer.
// (Hint: Approach this question in the following 
// way:a.Take a variable sum = 0
// b.Find the last digit of the number
// c.Add it to the sum
// d.Repeat a & b until the number becomes 0 )


import java.util.*;
public class practiceQuestion{
    public static void main(String[] args){
    Scanner sc= new Scanner (System.in);
    System.out.print("input an integer: ");
    int digits = sc.nextInt();
    System.out.println("the sum is "+ sumDigit(digits));

} 
public static int sumDigit(int n){
    int sumDigit = 0;
    while (n >0){
        int lastDigits = n%10;
        sumDigit += lastDigits;
        n/=10;

    }
    return sumDigit;
}
}
