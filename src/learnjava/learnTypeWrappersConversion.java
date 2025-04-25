package learnjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.out;

public class learnTypeWrappersConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int n;
        double sum = 0.0;
        double avg, t;

        out.println("How many numbers do you want to enter");
        str = br.readLine();
        try {
            n = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            out.println("Invalid Format");
            n=0;
        }
        out.println("Enter " + n +  " values");
        for(int i=0; i<n; i++){
            str = br.readLine();
            try{
                t = Double.parseDouble(str);
            } catch (NumberFormatException exc) {
                out.println("Invalid Format");
                t = 0.0;
            }
            sum += t;
            avg = sum / n;

            out.println("Average is " + avg);
        }

    }
}
