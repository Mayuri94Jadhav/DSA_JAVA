import java.util.*;
import java. util.Scanner;

// q. to print each char of the string
public class EachChar {
    static void printString(String str) {
        int n = str.length();
        for (int i =0; i<n; i++){
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }
     public static void main (String args[]){
        String str = "Mayuri";
        printString(str);
    }
}