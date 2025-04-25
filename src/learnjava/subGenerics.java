package learnjava;
import static java.lang.System.out;

class subGenerics<T> {
    T ob;

    subGenerics(T o){
        this.ob = o;
    }

    T getOb(){
        return ob;
    }

    void showType(){
        out.println("Type of T is " +  ob.getClass().getName());
    }
}

class doubleGenerics<T, V>{
    T ob1;
    V ob2;

    doubleGenerics(T o, V o2){
        this.ob1 = o;
        this.ob2 = o2;
    }

    T getOb1(){
        return this.ob1;
    }

    V getOb2(){
        return this.ob2;
    }

    void showType(){
        out.println("Type of T is " + ob1.getClass().getName());
        out.println("Type of V is " + ob2.getClass().getName());
    }
}
