package learnjava;

import java.io.PrintWriter;

public class learnPrintWriter {
    public static void main(String[] args){
        PrintWriter pw = new PrintWriter(System.out, true);
        int i= 10;
        double d = 123.65;

        pw.println("Using a print writer");
        pw.println(i);
        pw.println(d);

        pw.println( i + " + " + d + " is " + (i+d));



    }
}
