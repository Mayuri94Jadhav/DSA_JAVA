import java.util.*;
public class halfPyramid{
    public static void main(String args[]){
        // int n=7;
        // for(int line =1 ; line<=n; line++ ){
        //     for(int number=1;  number<=line ; number++){
        //         System.out.print(number);
        //     }
        // System.out.println();
        // }


        //  for the character half pyramid
        char ch = 'A';
        int n=5;
        for(int  i = 1; i<= n; i++){
            for(int j=1;j<=i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

    }
}