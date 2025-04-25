package learnjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.out;

public class learnBufferedReader {
    public static void main(String[] args) throws IOException{
        char c = 0;
        String str = "a";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        do{
//            c = (char) br.read();
//            out.print(c + " ");
//        }while(c != '.');
        
//        while(c != '.'){
//            c = (char) br.read();
//            out.print(c);
//        }

        while(!str.equals("stop")){
            str = br.readLine();
            out.println(str);
        }
    }
}
