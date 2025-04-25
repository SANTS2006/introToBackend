package learnjava;

class byTwos implements Series{
    int start;
    int val;

    byTwos(){
        start = 0;
        val = 0;
    }

    byTwos(Series s){
        s.setStart(9);
        s.getNext();
        s.reset();
    }

     public int getNext(){
        val += 2;
        return val;
     }

     public void reset(){
        val = start;
     }

     public void setStart(int x){
        this.start = x;
        this.val = x;
     }
}

public class learnSeries {
    public static void main(String[] args){
        byTwos bt = new byTwos();

        Series bt1 = new byTwos(bt);

        for(int i=0; i<10; i++){
            System.out.println("The next value is " + bt.getNext());
        }
//
//        for (int i=0; i<4; i++){
//            System.out.println("Next value is " + bt.getNext());
//        }
//
//        System.out.println("Resetting");
//        bt.reset();
//        for(int i=0; i<4; i++){
//            System.out.println("Next value is " + bt.getNext());
//        }
//
//        System.out.println("Starting at 100");
//        bt.setStart(100);
//        for(int i=0; i<4; i++){
//            System.out.println("Next value is " + bt.getNext());
//        }

    }
}
