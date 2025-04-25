package learnjava;
import static java.lang.System.in;
import static java.lang.System.out;

public class learnExceptionHandling {
    public static void main(String[] args){
        int[] num = {4,8,16,32,64,128, 256, 512};
        int[] deno = {2, 0, 4, 4, 0, 8};


        for(int i=0; i< num.length; i++) {
            try {
                out.println(num[i] + " / " + deno[i] + " = " + num[i] / deno[i]);
            }
//            catch (ArithmeticException e) {
//                out.println("Cannot divide by zero ");
////                System.out.println(e);
//            }
            catch(ArrayIndexOutOfBoundsException e){
                out.println("No matching elements found at index[" + i +"] = " + num[i]);
            }
            catch(Exception e){
                out.println("Some exception occurred");
            }
        }

        out.println();
        out.println();
        out.println();
        out.println();

        out.println("Learn the nested try and catch clause");

        try{
            for(int i=0; i<num.length; i++){
                try{
                    out.println(num[i] + " / " + deno[i] + " = " +  num[i]/deno[i]);
                }
                catch(ArithmeticException e){
                    out.println("Cannon divide by Zero");
                }
            }

        }
        catch (ArrayIndexOutOfBoundsException e){
            out.println("Exception Caught at index");
            out.println("Fatal error - program terminated");
        }

    }
}
