package learnjava;
import static java.lang.System.out;

@Deprecated
class myAnno {
    private String msg;

    myAnno(String m){
        this.msg =m;
    }

    @Deprecated
    String getMsg(){
        return this.msg;
    }

}

public class myAnnotation{
    public static void main(String[] args){
        myAnno ma = new myAnno("test");
        out.println(ma.getMsg());
    }
}

