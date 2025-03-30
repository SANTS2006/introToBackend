package learnjava;

class myClass{
    static int y;
    int x;
    int add(){
        return x + y;
    }
    static int val = 1024;

    static int valDivide(){
        return val/2;
    }

    static double rootof2;
    static double rootof3;

    static{
        System.out.println("inside static block");
        myClass.rootof2 = Math.sqrt(2.0);
        myClass.rootof3 = Math.sqrt(3.0);
    }
    myClass(String msg){
        System.out.println(msg);
    }
}

public class learnStaticVariablesMethodsBlock {
    public static void main(String[] args){
//        myClass mc = new myClass();
//        mc.x = 20;
//        myClass.y = 50;
//
//        int result = mc.add();
//        System.out.println(result);

        int result2 = myClass.valDivide();
        System.out.println(result2);

        myClass mc1 = new myClass("Inside Constructor");
        System.out.println("Square root of 2.0 = " + myClass.rootof2);
        System.out.println("Square root of 3.0 = " + myClass.rootof3);
    }
}
