package learnjava;

import java.io.IOException;
import java.io.RandomAccessFile;
import static java.lang.System.out;

public class learnRandomAccessFile {
    public static void main(String[] args){
        double[] data = {19.4, 10.1, 123.54, 33.0, 87.9, 74.25};
        double d;

        try(RandomAccessFile raf = new RandomAccessFile("random.dat", "rw")){
            for (double datum : data) {
                raf.writeDouble(datum);
            }

            raf.seek(0);
            d = raf.readDouble();
            out.println("First Value " + d);

            raf.seek(8);
            d = raf.readDouble();
            out.println("Second Value " + d);

            raf.seek(8 * 2);
            d = raf.readDouble();
            out.println("Third Value " + d);

            out.print("Values stored in the data array are: ");
            for(int i=0; i<data.length; i++){
                raf.seek(8 * i);
                d = raf.readDouble();
                    out.print(d + " ");
            }
        }
        catch(IOException exc){
            out.println("I/O Error " + exc);
        }

    }
}
