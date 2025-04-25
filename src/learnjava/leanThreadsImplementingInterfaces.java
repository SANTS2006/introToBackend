package learnjava;
import static java.lang.System.out;


public class leanThreadsImplementingInterfaces {
    public static void main(String[] args){
        out.println("Main thread starting");

        myThreadImplementsRunnable mt = new myThreadImplementsRunnable("Child #1");

//        Thread newThread = new Thread(mt);
//
//        newThread.start();

        for(int i=0; i<50; i++){
            out.println(".");
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException exc){
                out.println("Main thread interrupted");
            }
        }
        out.println("Main thread ending");
    }
}
