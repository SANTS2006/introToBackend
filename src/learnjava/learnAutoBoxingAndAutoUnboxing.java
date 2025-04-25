package learnjava;
import static java.lang.System.out;
import static java.lang.Math.sqrt;

public class learnAutoBoxingAndAutoUnboxing {
    static void m(Integer v){
        out.println("m() received " + v);
    }

    static int m2(){
        return 10;
    }

    static Integer m3(){
        return 99;
    }

    public static void main(String[] args){
        Integer iob = 100;
        int i = iob.intValue();

        out.println(i + " " + iob);

        m(199);

        Integer iob1 = m2();
        out.println("Returned value form m2() is " + iob1);

        int i1 = m3();
        out.println("Returned value from m3() is "  + i1);

        iob1 = 100;
        out.println("Square root of " + iob + " is " + sqrt(100));
    }
}
