package learnjava;
import static java.lang.System.out;

public class subMultipleThread implements Runnable{
    Thread newThread;

    subMultipleThread(String name){
        this.newThread = new Thread(this, name);
        newThread.start();
    }

    public void run(){
        out.println(newThread.getName() + " starting");
        try{
            for(int count = 0; count<10; count++){
                Thread.sleep(400);
                out.println("In " + newThread.getName() + ", count is " + count);
            }
        }
        catch(InterruptedException exc){
            out.println(newThread.getName() + " interrupted");
        }

        out.println(newThread.getName() + " terminated");
    }
}
