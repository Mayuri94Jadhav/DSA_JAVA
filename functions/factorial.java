public class factorial{
    public static long factorial(int n){
        if(n < 0){
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        if(n <= 1){
            return 1L;
        }
        long result = 1L;
        for(int i=2; i<=n; i++){
            result *= i;
        }
        return result;
    } 
    public static void main(String args[]){
        System.out.println(factorial(6));
    }
}