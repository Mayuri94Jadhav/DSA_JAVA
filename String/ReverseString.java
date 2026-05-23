import java.util.*;
import java.util.Scanner;

//q. reverse the string

public class ReverseString {
    static String reverseString (String str) {
        String res ="";
        int n =str.length();
        for(int i=n-1; i>=0 ; i--) {
            char ch =str.charAt(i);
            res = res + ch;

        }
        return res;
    }
    public static void main (S tring args[]){
        String str ="Mayuri";
        System.out.println(reverseString(str));
    }
}