package learnjava;
import static java.lang.System.out;

public class learnGenerics {
    public static void main(String[] args){
        subGenerics<Integer> iob;

        iob = new subGenerics<Integer>(20);

        iob.showType();

        int v = iob.getOb();
        out.println("Value: " + v);

        subGenerics<String> strob = new subGenerics<String>("Newton");

        strob.showType();

        String str = strob.getOb();

        out.println("Value: " + str);

        doubleGenerics<String, Integer> dg = new doubleGenerics<String, Integer>("Tamba", 18);
        dg.showType();

        String str1 = dg.getOb1();
        int age = dg.getOb2();
        out.println("My name is " + str1 + " and I am " + age + " years old");
    }
}
