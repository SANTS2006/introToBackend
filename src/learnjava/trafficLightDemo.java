package learnjava;
import static java.lang.System.out;

public class trafficLightDemo {
    public static void main(String[] args){
        trafficLightThread t1 = new trafficLightThread(trafficLightStates.RED);
        for(int i=0; i<9 ; i++){
            out.println(t1.getColor());
//            t1.waitForChange();
        }
        t1.cancel();
    }
}
