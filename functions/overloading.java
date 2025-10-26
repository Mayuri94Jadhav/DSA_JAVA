// The function with same name but different parameter types is called  function overloading

public class overloading {
    // Function with two integer parameters
    public int add(int a, int b) {
        return a + b;
    }

    // Function with three integer parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Function with two double parameters
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        overloading obj = new overloading();
        
        System.out.println("Sum of two integers: " + obj.add(5, 10));
        System.out.println("Sum of three integers: " + obj.add(5, 10, 15));
        System.out.println("Sum of two doubles: " + obj.add(5.5, 10.5));
    }
} 