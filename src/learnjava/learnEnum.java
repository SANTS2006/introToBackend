package learnjava;
import static java.lang.System.out;


public class learnEnum {
    public static void main(String[] args){
        Transport tp, tp1, tp2, tp3;
        out.println("Here are all Transport constants");

        Transport[] allTransports = Transport.values();

        for(Transport t : allTransports){
            out.print(t + " ");
        }

        out.println();

//        OR

        for(Transport t : Transport.values()){
            out.print(t + " ");
        }

        out.println();

        tp = Transport.valueOf("CAR");
        out.println(tp);

        out.println();

        out.print("Typical speed for an airplane is " + Transport.AIRPLANE.getSpeed() + " whose name is " + Transport.AIRPLANE.getName() + " miles per hour");

        out.println("All Transport speed");

        for(Transport trans : Transport.values()){
            out.println( trans.getName() + " which is a " + trans + " typical speed is " + trans.getSpeed() + " miles per hour");
        }

        out.println();
        out.println();
        out.println();

        for(Transport ord : Transport.values()){
            out.println(ord + " has an ordinal of " + ord.ordinal());
        }

        tp1 = Transport.AIRPLANE;
        tp2 = Transport.TRAIN;
        tp3 = Transport.AIRPLANE;

        out.println();

        if(tp1.compareTo(tp2) < 0){
            out.println(tp1 + " comes before " + tp2);
        }
        if(tp1.compareTo(tp2) > 0){
            out.println(tp2 + " comes before " + tp1);
        }
        if(tp3.compareTo(tp3) == 0){
            out.println(tp3 + " equals " + tp3);
        }


    }
}
