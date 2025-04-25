package learnjava;
import static java.lang.System.out;

public class understandTheArgs {
    public static void main(String[] args){
        out.println("There are " + args.length + " command line arguments");

        out.println("They are ");
        for(int i= 0; i< args.length; i++){
            out.println("arg[" + i + "] = " + args[i]);
        }
    }

}
