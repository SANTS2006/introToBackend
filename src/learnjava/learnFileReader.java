package learnjava;

import java.io.*;
import static java.lang.System.out;

public class learnFileReader {
    public static void main(String[] args) throws IOException {
        String str;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try(FileWriter fw = new FileWriter("test.txt", true)){
            do{
                str = br.readLine();
                if(str.compareTo("stop") == 0){
                    break;
                }
                fw.write(str);

            }while(str.compareTo("stop") != 0);
        }
        catch(IOException exc){
            out.println("I/O Error " + exc);
        }

        out.println();
        out.println();
        out.println();

        String s;
        try(BufferedReader br1 = new BufferedReader(new FileReader("test.txt"))){
            while((s = br1.readLine()) != null){
                out.println(s);
            }        }
        catch(IOException exc){
            out.println("I/O Error " + exc);
        }
    }
}
