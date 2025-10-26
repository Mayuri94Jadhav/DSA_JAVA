import java.util.*;
public class largest_no{
    public static int largestNo( int numbers[]) {
        int largest = Integer.MIN_VALUE;   // -infinity
        int smallest = Integer.MAX_VALUE; 
        for(int i=0; i< numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
        }
        }
        System.out.println("smallest value is : "+ smallest);
        return  largest;
    }
    public static void main(String args[]){
        int numbers[]={1,4,6,8,9,10};
        System.out.println("largest value is "+ largestNo(numbers)); 
    }
}