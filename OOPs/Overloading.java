
//...........  Overloading is an compiletime method Polymoreprism ...........
public class Overloading {
    public static void main(String args[]) {
        Calculator cal = new Calculator();
        System.out.println(cal.sum(1,2));
        System.out.println(cal.sum((float)1.2, (float)2.3));
        System.out.println(cal.sum(1,2,3));

    }
}

class Calculator{
    int sum(int a, int b ){
        return a + b;
    }

    
    float sum(float a,float b ){
        return a+b;
    }

    
    int sum(int a, int b , int c){
        return a+b+c;
    }
} 