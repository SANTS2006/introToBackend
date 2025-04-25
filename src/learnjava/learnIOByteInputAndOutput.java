package learnjava;
import java.io.IOException;

import static java.lang.System.in;
import static java.lang.System.out;

public class learnIOByteInputAndOutput {
    public static void main(String[] args) throws IOException{
        byte[] data = new byte[10];

        out.println("Enter some characters: ");
        int numRead = in.read(data);
        out.println("You entered: ");
        for(int i=0; i<numRead; i++){
            out.println("data[" + i + "] = " + (char) data[i]);
        }

//        int b;
//        b= 'X';
//        out.write(b);
//      out.write('\n');
    }
}
