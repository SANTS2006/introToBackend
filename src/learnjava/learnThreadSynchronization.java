package learnjava;
import static java.lang.System.out;

public class learnThreadSynchronization {
    public static void main(String[] args){
        out.println("Main thread starting");
        int [] a = {1,2,3,4,5};
        myNewThread mnt1 = new myNewThread("Child #1", a);
        myNewThread mnt2 = new myNewThread("Child #2", a);
        myNewThread mnt3 = new myNewThread("Child #3", a);

        try{
            mnt1.newThread.join();
            mnt2.newThread.join();
            mnt3.newThread.join();
        }
        catch(InterruptedException exc){
            out.println("Main Thread interrupted");
        }
        out.println("Main thread ending");

    }
}
