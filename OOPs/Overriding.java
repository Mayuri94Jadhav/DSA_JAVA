
// ..........Parents and child classes both cotain the "same function" with "different defination"...........

class Overriding{

public static void main(String args[]){
    Deer d = new Deer();
    d.eat();
}    
}
class Animal{
    void eat (){
        System.out.println("eat everrthing");

    }
}

class  Deer extends Animal{
    void eat (){
        System.out.println(" deer eat grass");
        
    }
}