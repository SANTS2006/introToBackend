package learnjava;
import static java.lang.System.out;

public class learnSynchronizedSumArray {
    private int sum;

    synchronized int sumArray(int[] num){
        sum = 0;
        for(int add: num){
            sum += add;
            out.println("Running total for " +Thread.currentThread().getName() + " is " + sum);
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException exc){
                out.println("Thread interrupted");
            }
        }

        return sum;
    }
}

class myNewThread implements Runnable{
    Thread newThread;

    static learnSynchronizedSumArray sa = new learnSynchronizedSumArray();
    int[] a;
    int answer;

    myNewThread(String name, int[] num){
        newThread = new Thread(this, name);
        this.a = num;
        newThread.start();
    }

    public void run(){
        out.println(newThread.getName() + " starting.");

        answer = sa.sumArray(a);
        out.println("Sum for " + newThread.getName() + " is " + answer);

        out.println( newThread.getName() + " terminated");
    }
}
