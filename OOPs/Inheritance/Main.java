interface Singer {
    void sing();
}

interface Dancer {
    void dance();
}

// Base Class
class Person {
    void eat() {
        System.out.println("Person eats");
    }
}

// Single Inheritance
class Employee extends Person {
    void work() {
        System.out.println("Employee works");
    }
}

// Multilevel Inheritance
class Manager extends Employee {
    void manage() {
        System.out.println("Manager manages team");
    }
}

// Hierarchical Inheritance
class Student extends Person {
    void study() {
        System.out.println("Student studies");
    }
}

// Multiple Inheritance using Interfaces
class Artist implements Singer, Dancer {

    public void sing() {
        System.out.println("Artist sings");
    }

    public void dance() {
        System.out.println("Artist dances");
    }
}

// Hybrid Inheritance
class Intern extends Employee implements Singer {

    public void sing() {
        System.out.println("Intern sings");
    }

    void learn() {
        System.out.println("Intern learns");
    }
}

public class Main {

    public static void main(String[] args) {

        System.out.println("---- Single Inheritance ----");
        Employee e = new Employee();
        e.eat();
        e.work();

        System.out.println("\n---- Multilevel Inheritance ----");
        Manager m = new Manager();
        m.eat();
        m.work();
        m.manage();

        System.out.println("\n---- Hierarchical Inheritance ----");
        Student s = new Student();
        s.eat();
        s.study();

        System.out.println("\n---- Multiple Inheritance ----");
        Artist a = new Artist();
        a.sing();
        a.dance();

        System.out.println("\n---- Hybrid Inheritance ----");
        Intern i = new Intern();
        i.eat();
        i.work();
        i.sing();
        i.learn();
    }
}