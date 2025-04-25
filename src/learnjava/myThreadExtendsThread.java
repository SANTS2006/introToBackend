package learnjava;
import static java.lang.System.out;
class myThreadExtendsThread extends Thread {
    String thrdname;
    myThreadExtendsThread(String name){
//        super();
        this.thrdname = name;
        start();
    }
    public void run(){
        out.println(thrdname + " starting");
        try{
            for(int count =0; count < 10; count++){
                Thread.sleep(400);
                out.println("In " + thrdname + ", count is " + count);
            }
        }
        catch(InterruptedException exc){
            out.println(thrdname + " interrupted");
        }
        out.println(thrdname + " terminated");
    }
}
