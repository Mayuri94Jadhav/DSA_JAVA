public class Constructor {

    String name;
    int age;

    Constructor() {
        name = "Unknown";
        age = 0;
        System.out.println("Non-param called");
    }

    Constructor(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Param called");
    }

    Constructor(Constructor c) {
        this.name = c.name;
        this.age = c.age;
        System.out.println("Copy called");
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Constructor c1 = new Constructor();
        c1.display();

        Constructor c2 = new Constructor("Mayuri", 21);
        c2.display();

        Constructor c3 = new Constructor(c2);
        c3.display();
    }
}    