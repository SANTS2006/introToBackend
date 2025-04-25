package learnjava;
import static java.lang.System.out;

import java.io.*;

public class learnDataInputAndOutput {
    public static void main(String[] args) {
        int i= 10; double d= 30.24; boolean b = true;

        try(DataOutputStream dout = new DataOutputStream(new FileOutputStream("newton")))
        {
            out.println("Writing " + i);
            dout.writeInt(i);

            out.println("Writing " + d);
            dout.writeDouble(d);

            out.println("Writing " + b);
            dout.writeBoolean(b);

        }
        catch(IOException exc){
            out.println("Write error");
        }

        out.println();

        try(DataInputStream din = new DataInputStream(new FileInputStream("newton"))){
            i = din.readInt();
            out.println("Reading  " + i);

            d = din.readDouble();
            out.println("Reading  " + d);

            b = din.readBoolean();
            out.println("Reading  " + b);
        }
        catch(IOException exc){
            out.println("Error Reading");
        }
    }
}
