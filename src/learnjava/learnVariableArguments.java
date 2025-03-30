package learnjava;

class valArgs{

    static void valTest(int ...v){
        System.out.println("Number of args " + v.length);
        System.out.println("Contents: ");
        for(int i : v){
              System.out.println("Args " + i + ": " + i);
        }
        System.out.println();
    }
}

public class learnVariableArguments {
    public static void main(String[] args){
        valArgs.valTest();
        valArgs.valTest(10);
        valArgs.valTest(1, 2, 3);
    }
}
