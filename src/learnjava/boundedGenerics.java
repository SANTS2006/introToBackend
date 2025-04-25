package learnjava;
import static java.lang.System.out;

class boundedGenerics<T extends Number> {
    T num;

    boundedGenerics(T n){
        this.num = n;
    }

    T getNum(){
        return this.num;
    }

    double reciprocal(){
        return 1 / this.num.doubleValue();
    }

    double fraction(){
        return this.num.doubleValue() - this.num.intValue();
    }
//    Wild Card arguments
    boolean absEqual(boundedGenerics<?> ob){
        if(Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue())){
            return true;
        }
        return false;
    }
}
