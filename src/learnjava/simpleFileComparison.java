package learnjava;
import java.io.FileInputStream;
import java.io.IOException;

import static java.lang.System.out;

public class simpleFileComparison {
    public static void main(String[] args){
        int i=0, j= 0;

        if(args.length != 2){
            out.println("Usage: comparing Files 1 and 2");
            return;
        }

        try(FileInputStream fin1 = new FileInputStream(args[0]) ;
            FileInputStream fin2 = new FileInputStream(args[1]))
        {
            do{
                i = fin1.read();
                j = fin2.read();

                if( i != j){
                    break;
                }
            }while( i != -1 && j != -1);

            if( i != j){
                out.println("Files differ");
            }
            else{
                out.println("Files are the same");
            }
        } catch (IOException exc) {
           out.println("I/O Error " + exc);
        }


    }
}
