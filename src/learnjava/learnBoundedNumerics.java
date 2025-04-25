package learnjava;
import static java.lang.System.out;

public class learnBoundedNumerics {
    public static void main(String [] args){
        boundedGenerics<Double> dob= new boundedGenerics<>(5.25);

        double dou = dob.getNum();

        out.println("The reciprocal of " + dou + " is " + dob.reciprocal());
        out.println("The fraction of " + dou + " is " + dob.fraction());

        boundedGenerics<Integer> iob= new boundedGenerics<>(5);
        int i = iob.getNum();

        out.println("The reciprocal of " + i + " is " + iob.reciprocal());
        out.println("The fraction of " + i + " is " + iob.fraction());

        out.println();
        out.println();
        out.println();

        boundedGenerics<Long> lob = new boundedGenerics<>(5L);
        boundedGenerics<Integer> iob1 = new boundedGenerics<>(6);
        boundedGenerics<Double> dob1 = new boundedGenerics<>(-6.0);

        if(iob1.absEqual(dob1)){
            out.println("Absolute values are the same");
        }
        else{
            out.println("Absolute values differ");
        }

        if(iob1.absEqual(lob)){
            out.println("Absolute values are equal");
        }
        else{
            out.println("Absolute values differ");
        }
    }
}
