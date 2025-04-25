package learnjava;
import static java.lang.System.out;

public class learnMultipleThread {
    public static void main(String[] args){
        out.println("Main Thread starting");
        subMultipleThread smt1 = new subMultipleThread("Child #1");
        subMultipleThread smt2 = new subMultipleThread("Child #2");
        subMultipleThread smt3 = new subMultipleThread("Child #3");

        smt1.newThread.setPriority(10);
        out.println(smt2.newThread.getPriority());
        out.println(smt3.newThread.getPriority());

//        for(int i=0; i<50; i++){
//            out.println(".");
//            try{
//                Thread.sleep(100);
//            }
//            catch(InterruptedException exc){
//                out.println("Main thread Interrupted");
//            }
//        }
//        out.println("Main thread ending");

//        do{
//            out.println(".");
//            try{
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                out.println("Main thread interrupted");
//            }
//        }while(smt1.newThread.isAlive() || smt2.newThread.isAlive() || smt3.newThread.isAlive());
//
//        out.println("main thread ending");

        try{
            smt1.newThread.join();
            out.println("Child #1 joined");
            smt2.newThread.join();
            out.println("Child #2 joined");
            smt3.newThread.join();
            out.println("Child #3 joined");
        }
        catch(InterruptedException exc){
            out.println("Main thread interrupted");
        }
        out.println("Main thread ending");

    }
}
