package learnjava;

import java.io.File;
import static java.lang.System.out;

public class learnFileUtilityMethods {
    public static void main(String[] args){
        File myfile = new File("D://");

        out.println("Free Space " + myfile.getTotalSpace());
    }
}
