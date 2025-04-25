package learnjava;
import static java.lang.System.out;

class myThreadImplementsRunnable  implements Runnable{
    String thrdName;
    Thread thrd;

//   myThreadImplementsRunnable(String name){
//        this.thrdName = name;
//    }
//    public void run(){
//        try{
//            out.println(thrdName + " starting");
//            for(int count = 0; count < 10; count++){
//                Thread.sleep(400);
//                out.println("In " + thrdName + ", count is " + count);
//            }
//        }
//        catch(InterruptedException exc){
//            out.println(thrdName + " interrupted");
//        }
//        out.println(thrdName + " terminated");
//    }

    myThreadImplementsRunnable(String name){
        thrd = new Thread(this, name);
        thrd.start();
    }

    public void run(){
        out.println(thrd.getName() + " Starting");
        try{
            for(int count = 0; count < 10; count++){
                Thread.sleep(400);
                out.println("In " + thrd.getName() + ", count is " + count);
            }
        } catch (InterruptedException e) {
            out.println(thrd.getName() + " interrupted");
        }
        out.println(thrd.getName() + " terminated");
    }
}
