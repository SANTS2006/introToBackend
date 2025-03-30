package learnjava;

class Test{

    int a, b;

    void noChange(int i, int j){
        i = i + j;
        j = -j;
    }

    Test(int i, int j){
        this.a = i;
        this.b = j;
    }

    void change(Test t){
        t.a = t.a + t.b;
        t.b = -t.b;
    }
}

public class learnCallByValueAndReference {
    public static void main(String[] args){
//        Test t = new Test();
//        int a = 20, b = 35;
//        System.out.println("Values of a and b before call " + a + " " + b);
//
//        t.noChange(a, b);
//
//        System.out.println("Values of a and b after call " + a + " " + b);

        Test t1 = new Test(20, 35);
        System.out.println("Values of a and b before call " + t1.a + " " + t1.b);

        t1.change(t1);
        System.out.println("Values of a and b after call " + t1.a + " " + t1.b);
    }
}
