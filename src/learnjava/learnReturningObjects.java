package learnjava;

class Err{
    String[] msg  = {"Output Error", "Input Error", "Disk Full", "Index Out-Of-Bounds"};
    String getErrorMessage(int i){
        return i >= 0 && i < msg.length ? msg[i] : "Invalid Error Code";
        //if(i>=0 && i<msg.length){
//            return msg[i];
//        }
//        else{
//            return "Invalid Error Code";
//        }
    }
}

public class learnReturningObjects {
    public static void main(String[] args){
         Err e = new Err();
            System.out.println( e.getErrorMessage(2));
            System.out.println( e.getErrorMessage(0));
    }
}
