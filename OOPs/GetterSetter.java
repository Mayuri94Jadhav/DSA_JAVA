import java.util.*;
import java.util.Scanner;

class GetterSetter {
    private String name ;
    
    public String getName(){       // getter
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args){
        GetterSetter s = new GetterSetter();
        s.setName(" mayuri");     // set Name
        System.out.println(s.getName()); // get name
     }
    
}