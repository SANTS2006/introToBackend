package learnjava;

class errMsg{
    String msg;
    int severity;

    errMsg(String m, int sev){
        this.msg = m;
        this.severity = sev;
    }
}

class errInfo{
    String[] msg  = {"Output Error", "Input Error", "Disk Full", "Index Out-Of-Bounds"};
    int[] howBad  = {3,3,2,4};

    errMsg getErrInfo(int i){
        return i>=0 && i < msg.length ? new errMsg(msg[i], howBad[i]) : new errMsg("Invalid Error Code", 0);
    }
}
public class learnReturningObjectsOfClasses {
    public static void main(String[] args){
        errInfo ei = new errInfo();
        errMsg e;

        e = ei.getErrInfo(2);
        System.out.println(e.msg + " Severity " + e.severity);

        e = ei.getErrInfo(19);
        System.out.println(e.msg + " Severity " + e.severity);
    }
}
