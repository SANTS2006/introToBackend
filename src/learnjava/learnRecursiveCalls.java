package learnjava;

class recursiveCalls{
    int drawStarts(int n){
        if(n == 1){
           return 1;
        }
        else {
            return n * drawStarts(n - 1);
        }
    }
}

class printArray{
    void printArray1(int[] array){
        printArrayAux(array, 0);
        System.out.println();
    }
    void printArrayAux(int[] array, int index){
        if(index == array.length){
            return;
        }
        else{
            System.out.print("array[" + index + "] = " +array[index]);
            System.out.println();
            printArrayAux(array, index + 1);
        }
    }
}
public class learnRecursiveCalls {
    public static void main(String[] args){
            recursiveCalls rc = new recursiveCalls();
            int result = rc.drawStarts(3);
            System.out.println(result);


            printArray pa = new printArray();
            int[] array = {3, 2, 4, 6, 10, 12, 23, 24};

            pa.printArray1(array);



    }
}
