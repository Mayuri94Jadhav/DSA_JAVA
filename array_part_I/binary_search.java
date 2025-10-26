import java.util.*;
public class binary_search{
public static int binarySearch(int numbers[], int key){
    int start = 0, end = numbers.length-1;
    while (start<= end){
        int mid = (start + end)/2;
        // comparision
        if(numbers[mid] == key){
            return mid;
        }
        if(numbers[mid]<key){
            start = mid + 1;      // right search
        } else{
            end = mid -1 ;       // left search
        }

    }
    return -1;
}
public static void main(String args[]) {
    int numbers[] = {1,2,4,6,8,9,10,11};
    int key =8;
    // int key =18;     // return -1 
    System.out.println("index for key is :"+binarySearch(numbers, key));
}
}