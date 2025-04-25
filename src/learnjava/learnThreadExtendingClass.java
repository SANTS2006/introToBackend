package learnjava;
import static java.lang.System.out;
public class learnThreadExtendingClass {
    public static void main(String[] args){
        out.println("Main thread starting");
        myThreadExtendsThread mtet = new myThreadExtendsThread("Child #1");
        Thread thred = new Thread(mtet);
        thred.start();

        for(int i=0; i<50; i++){
        try{
            out.println(".");

                Thread.sleep(100);

        }
        catch(InterruptedException exc){
            out.println("Main thread interrupted");
        }
        }
        out.println("Main thread ending");
    }
}
