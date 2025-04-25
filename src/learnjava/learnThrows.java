package learnjava;
import java.io.IOException;

import static java.lang.System.in;
import static java.lang.System.out;
class useDemo{
    public static char prompt(String str) throws IOException {

        out.println(str + " ");
        return (char) in.read();
    }

}
public class learnThrows {
    public static void main(String [] args){
        char ch;

        try{
            ch = useDemo.prompt("Enter a letter:");
        }
        catch(java.io.IOException exc){
            out.println("IO Exception");
            ch = 'X';
        }
        out.println("You pressed " +ch);
    }
}
