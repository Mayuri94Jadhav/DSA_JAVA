// Interface is "bluprint " of class
// thhe main use:
// 1. multiple Inheritance (java not  allow multiple inhertance but with the  help interface we can impliment )
// 2.total Abstraction

// ..........Proprty of interfaces........
// 1.all methods are public , abstract & without implementation
// 2. used to achieve total abstraction
// 3. var in the interrface are final ,public and  static.


// ....note: in classes we use" extends" and in interface we use :"impliments".


public class Interfaces{
    public static void main(String args[]){
        Queen q = new Queen();
        q.moves();
    }
}

interface ChessPlayer {
    void moves();
}
class  Queen implements ChessPlayer {
    public void moves(){
        System.out.println("up,down,left,right,diogonal(in all direction)");
    }
}

class  Rook implements ChessPlayer {
    public void moves(){
        System.out.println("up,down,left,right");
    }
}