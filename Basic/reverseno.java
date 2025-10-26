public class reverseno{
    public static void main (String args[]){
        int n = 100078;
        int rev = 0;
        while(n > 0){
            int lastdigit = n % 10; // Get the last digit
            // System. out.print(lastdigit + "");

            rev = (rev*10) + lastdigit; // Add it to the reversed number

            n= n/10;
        }
        System.out.print(rev);
    }
}