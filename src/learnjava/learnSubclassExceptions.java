package learnjava;
import static java.lang.System.out;

class miniException extends Exception{
    int n, d;

    miniException(int i, int j){
        super("Result is not an integer");
        this.n = i;
        this.d =j;
    }
    public String toString(){
        return super.toString();
    }
}

public class learnSubclassExceptions {
    public static void main(String[] args){
        int[]  num = {4, 8, 15, 32, 64, 127, 256, 512};
        int[] deno = {2, 0, 4, 4, 0, 8};


        for(int i=0; i<num.length; i++){
            try{
                if((num[i]%deno[i]) != 0){
                    throw new miniException(num[i], deno[i]);
                }
                else{
                    out.println(num[i] + " / " + deno[i] + " = " + num[i]/deno[i]);
                }
            }
            catch(ArithmeticException exc){
                out.println("Cannon divide by zero");
            }
            catch(ArrayIndexOutOfBoundsException exc){
                out.println("Matching index not found");
            }
            catch(miniException exc){
                out.println(exc);
            }
        }
    }
}
