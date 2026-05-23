import java.util.*;
import java.util.Scanner;

// q. count length of String without using length().
public class StringLength {
    static int getLengthOfString (String str){
        char[] arr = str.toCharArray();
        int len = arr.length;
        return len;

    }
    public static void main(String args[]){
        String str ="Mayuri";
        System.out.println(getLengthOfString(str));
    }
}