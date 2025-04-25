package learnjava;
import static java.lang.System.out;


class forSuspendStopRestart implements Runnable {
    Thread newthread;
    boolean suspended;
    boolean stopped;

    forSuspendStopRestart(String name){
        newthread = new Thread(this, name);
        this.suspended = false;
        this.stopped = false;
        newthread.start();
    }

    public void run(){
        out.println(newthread.getName() + " starting");
        try{
            for(int i= 1; i<1000; i++){
                out.print( i + " ");
                if((i%10) == 0){
                    out.println();
                    Thread.sleep(250);
                }
                synchronized (this){
                    while(suspended){
                        wait();
                    }
                    if(stopped){
                        break;
                    }
                }
            }
        }
        catch(InterruptedException exc){
            out.println(newthread.getName() + " interrupted");
        }
        out.println( newthread.getName() + " terminated");
    }

    synchronized void myStop(){
        stopped= true;
        suspended = false;
        notify();
    }
    synchronized void suspend(){
        suspended = true;
    }

    synchronized void myResume(){
        suspended = false;
        notify();
    }
}
