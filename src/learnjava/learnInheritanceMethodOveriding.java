package learnjava;

class twoDShape{
    private double width;
    private double height;

    twoDShape(){
        this.width = this.height = 0.0;
    }
    twoDShape(double x){
        this.width = this.height = x;
    }

//    twoDShape(double w, double h){
//        this.width = w;
//        this.height = h;
//    }

    void setWidth(double w){
        this.width = w;
    }
    void setHeight(double h){
        this.height = h;
    }

    double getWidth(){
        return this.width;
    }
    double getHeight(){
        return this.height;
    }
    void showDim() {
        System.out.println("Width and height are " + width + " and " + height);
    }

}

class triangle extends twoDShape{
    private String style;

    triangle(){
        super();

        this.style = "none";
    }
    triangle(double x){
        super(x);

        this.style = "filled";
    }

//    triangle(String s, double w, double h){
//        super(w,h);
////        this.setWidth(w);
////        this.setHeight(h);
//        this.style = s;
//    }

    double area(){
        return this.getWidth() * this.getHeight()/2;
    }
    void showStyle(){
        System.out.println("Triangle is " + style);
    }
}

class A{
    int i, j;

    A(int a, int b){
        this.i = a;
        this.j = b;
    }
    void show(){
        System.out.println("i and j are " + this.i + " " + this.j);
    }
}

class B extends A{
    int k;
    B(int a, int b, int c){
        super(a, b);

        this.k = c;
    }
    void show(){
        super.show();
        System.out.println("K is " + this.k);
    }

}

public class learnInheritanceMethodOveriding {
    public static void main(String[] args){
        triangle t1 = new triangle();
//        triangle t2 = new triangle("outlined", 8.0, 12.0);
        triangle t3 = new triangle(4.0);

        System.out.println("info for t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is " + t1.area());

        System.out.println();

//        System.out.println("info for t2: ");
//        t2.showStyle();
//        t2.showDim();
//        System.out.println("Area is " + t2.area());

        System.out.println("info for t3: ");
        t3.showStyle();
        t3.showDim();
        System.out.println("Area is " + t3.area());

        B showB = new B(20, 10, 12);
        showB.show();
    }
}
