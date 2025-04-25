package learnjava;
import static java.lang.System.out;

public class learnSuspendStopAndRestartOfThreads {
    public static void main (String[] args){
        forSuspendStopRestart fssr = new forSuspendStopRestart("My Thread");

        try{
            Thread.sleep(1000);

            fssr.suspend();
            out.println("Suspending thread");
            Thread.sleep(1000);

            fssr.myResume();
            out.println("Resuming thread");
            Thread.sleep(1000);

            fssr.suspend();
            out.println("Suspending thread");
            Thread.sleep(1000);

            fssr.myResume();
            out.println("Resuming thread");
            Thread.sleep(1000);

            fssr.suspend();
            out.println("Stopping thread");

            fssr.myResume();
            out.println("Resuming thread");
            Thread.sleep(1000);

//            fssr.myStop();

        }catch(InterruptedException exc){
            out.println("Main thread interrupted");
        }
        out.println("Main Thread ending");
    }
}
