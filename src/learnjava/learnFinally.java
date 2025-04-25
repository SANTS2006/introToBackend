package learnjava;
import static java.lang.System.out;

class understandFinally {
    public static void genException(int what){
        int t;
        int[] num = new int[2];

        out.println("Receiving " + what);
        try{
            switch (what){
                case 0:
                    t = 10 / what;
                    break;
                case 1:
                    num[4] = 10;
                    break;
                case 2:
                    return;
            }
        }
        catch(ArithmeticException exc){
            out.println("Cannon divide by zero");
        }
        catch (ArrayIndexOutOfBoundsException exc){
            out.println("No matching record found");
        }
        finally{
            out.println("Leaving try");
        }


    }
}

public class learnFinally{
    public static void main(String[] args){
        for(int i= 0; i<3; i++){
            understandFinally.genException(i);
            out.println();
        }
    }
}
