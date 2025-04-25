package learnjava;
import static java.lang.System.out;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class learnFileInputStream {
    public static void main(String[] args){

        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;
        if(args.length != 2){
            out.println("Usage: showFile file");
            return;
        }

        try{
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);
        }
        catch(FileNotFoundException exc){
            out.println("File is not found");
            return;
        }
        try{
            do{
                i = fin.read();
                if(i != -1){
//                    out.println((char) i);
                    fout.write(i);
                }
            }while(i != -1);
        }catch(IOException exc){
            out.println("Error Reading file");
        }

        finally{
            try{
                if(fin != null) {
                    fin.close();
                }
            }
            catch(IOException exc){
                out.println("Error closing file");
            }
            try{
                if(fout != null){
                    fout.close();
                }
            }
            catch(IOException exc){
                out.println("Error closing file");
            }
        }
//
//      try{
//            fin.close();
//       }
//       catch(IOException exc){
//            out.println("Error closing File");
//        }
    }
}
