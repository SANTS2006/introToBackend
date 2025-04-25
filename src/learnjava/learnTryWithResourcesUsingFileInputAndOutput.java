package learnjava;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import static java.lang.System.out;

public class learnTryWithResourcesUsingFileInputAndOutput {
    public static void main(String [] args){
        int i;

        if(args.length != 2){
            out.println("Usage: Show file");
            return;
        }

        try(FileInputStream fin = new FileInputStream(args[0]); FileOutputStream fout = new FileOutputStream(args[1])){
            i = fin.read();

            while(i !=-1){
                fout.write(i);
            }
        }
        catch(IOException exc){
            out.println("I/O error " + exc);
        }


    }

}
