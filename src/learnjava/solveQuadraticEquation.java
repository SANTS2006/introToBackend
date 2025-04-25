package learnjava;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
import static java.lang.System.out;

public class solveQuadraticEquation {
    public static void main(String[] args){
        double a,b , c, x;
        a = 4; b = 1; c = -3;

        x = (-b + sqrt(pow(b, 2) - 4 * a * c))/ 2 * a;
        out.println("First Solution: " + x);

        x = (-b - sqrt(pow(b, 2) - 4 * a * c))/ 2 * a;
        out.println("Second Solution: " + x);
    }
}
