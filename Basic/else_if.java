import java.util.*;

public class else_if {
    public static void main (String args[]){
        int age =29;
        if(age < 18) {
            System.out.println("You are a minor.");
        } else if (age >= 18 && age < 60) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a senior citizen.");
        }


    }
}