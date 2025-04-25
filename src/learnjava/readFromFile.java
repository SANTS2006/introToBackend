package learnjava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import static java.lang.System.out;

public class readFromFile {
    public static void main(String[] args){
        int i=0;

        if(args.length != 1){
            out.println("USage:  show file");
            return;
        }

        try(FileInputStream fin = new FileInputStream(args[0])){
            do{
                i = fin.read();
                if(i != -1){
                    out.print((char) i);
                }
            }while(i != -1);
        }
        catch(IOException exc){
            out.println("I/O Error " + exc);
        }
    }
}
