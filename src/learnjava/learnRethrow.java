package learnjava;
import static java.lang.System.out;

public class learnRethrow {
    public static void genException(){
        int[] num = {4,8,16,32,64,128, 256, 512};
        int[] deno = {2, 0, 4, 4, 0, 8};

        for(int i=0; i<num.length; i++){
            try{
                out.println(num[i] + " / " + deno[i] + " = " + num[i]/deno[i]);
            }
            catch (ArithmeticException exc1){
                out.println("Cannot divide by Zero");
            }
            catch (ArrayIndexOutOfBoundsException exc){
                out.println("No matching element found");
                throw exc;
            }
        }
    }
}

class reThrow{
    public static void main(String[] args){
        try{
            learnRethrow.genException();
        }
        catch(ArrayIndexOutOfBoundsException exc){
            out.println("Fatal error - Program terminated");
            out.println("Standard Messages");
            out.println(exc);
            out.println("Stack Trace");
            exc.printStackTrace();

        }
        out.println("After Catch");
    }
}
