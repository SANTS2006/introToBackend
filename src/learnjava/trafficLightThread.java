package learnjava;
import static java.lang.System.out;

class trafficLightThread implements Runnable {
    private Thread newthread;
    private trafficLightStates tcs;
    boolean stop = false;
    boolean changed = false;

    trafficLightThread(trafficLightStates init){
        this.tcs = init;
        newthread = new Thread(this);

        newthread.start();
    }

    trafficLightThread(){
        tcs = trafficLightStates.RED;

        newthread = new Thread(this);
        newthread.start();
    }

    public void run(){
        while(!stop){
            try{
                switch (tcs){
                    case GREEN:
                        Thread.sleep(10000);
                    break;
                    case YELLOW:
                        Thread.sleep(2000);
                    break;
                    case RED:
                        Thread.sleep(12000);
                    break;
                }

            }catch(InterruptedException exc){
                out.println(exc);
            }
            changeColor();
        }
    }

    synchronized void changeColor(){
        switch (tcs){
            case RED:
                tcs = trafficLightStates.GREEN;
                break;
            case YELLOW:
                tcs = trafficLightStates.RED;
            break;
            case GREEN:
                tcs = trafficLightStates.YELLOW;
        }
        changed = true;
        notify();
    }

    synchronized void waitForChange(){
        try{
            while(!changed){
                wait();
                changed= false;
            }
        }
        catch(InterruptedException exc){
            out.println(exc);
        }
    }
    synchronized trafficLightStates getColor(){
        return tcs;
    }

    synchronized void cancel(){
        stop = true;
    }

}
