package learnjava;
import static java.lang.System.out;

public class learnThrowingException {
    public static void main(String [] args){

        out.println("Before Throw");
        try{
            out.println("IN TRY BLOCK");
            throw new ArithmeticException();
        }
        catch(ArithmeticException e){
            out.println("Exception Caught");
        }
        out.println("After Throw");
    }
}
