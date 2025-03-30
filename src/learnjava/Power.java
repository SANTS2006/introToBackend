package learnjava;

public class Power {
    double b;
    int e;
    double v;

    Power(double b, int e){
        this.b = b;
        this.e = e;

        this.v =1;
        if(e == 0) {
            return;
        }
        for(;e>0; e--) {
            this.v *= b;
        }
    }

    double getPower() {
        return this.v;
    }
}
