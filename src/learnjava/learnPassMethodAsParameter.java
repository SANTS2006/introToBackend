package learnjava;

class Block{
    private int a, b,c, volume;

    void setA(int a){
        this.a = a;
    }
    void setB(int b){
        this.b = a;
    }
    void setC(int c){
        this.c = c;
    }
    void setVolume(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    int getA(){
        return this.a;
    }
    int getB(){
        return this.b;
    }
    int getC(){
        return this.c;
    }
    int getVolume(){
        return this.volume;
    }
    Block(int a, int b, int c){
        this.a =a;
        this.b = b;
        this.c = c;
        this.volume = this.a * this.b * this.c;
    }

    boolean sameBlock(Block ob){
        if((ob.a ==a) && (ob.b == b) && (ob.c == c)){
            return true;
        }
        else{
            return false;
        }
    }
    boolean sameVolume(Block ob){
        if((ob.volume == volume)){
            return true;
        }
        else{
            return false;
        }
    }
}
public class learnPassMethodAsParameter {
    public static void main(String[] args){
    Block ob1 = new Block(10, 2, 5);
    Block ob2 = new Block(10, 2, 5);
    Block ob3 = new Block(4, 5, 5);

    System.out.println("ob1 has same dimensions as ob2: " + ob1.sameBlock(ob2));
    System.out.println("ob1 has same dimensions as ob3: " + ob1.sameBlock(ob3));
    System.out.println("ob1 has same volume as ob3: " + ob1.sameVolume(ob3));
    }
}
