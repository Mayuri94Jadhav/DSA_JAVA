
// hiding all the "unnecessary" details and showing only the importnt parts to the user.
// it means we give the "idea" of  subclasses implemention but "not the actual implimention "

//......properties.....
// 1. cannot create instance(object) of abstract class
// 2. can have abstract/ non abstract menthod
// 3. can have constructor.

public class Abstraction{
    public static void main(String args[]){
        Mustang myHorse = new Mustang();
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.eat();
        c.walk();

        

        // Animal a= new Animal(); .... note: can't create instance of abstract class

    }
    static abstract class Animal{ 
        Animal(){ // constructor
            System.out.println("animal constructor called");
        }

        void eat(){ 
            System.out.println("animal eats");            
        }
        abstract void walk(); // idea
    }
    static class Horse extends Animal {
        Horse() {
            System.out.println("horse constructor called");
        }
        void walk() {  // implimention
            System.out.println("walk on 4 legs");
        }
    }

    static class Mustang extends Horse{
        Mustang(){
            System.out.println("Mustang constructor called");

        }
    }

     static class Chicken extends Animal {
        void walk() {    // implimention
            System.out.println("walk on 2 legs");
        }
    }
}