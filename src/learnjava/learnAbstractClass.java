package learnjava;

abstract class Shapes{
    private double width;
    private double height;
    private String name;

    void setWidth(double w){
        this.width = w;
    }
    void setHeight(double h){
        this.height = h;
    }
    void setName(String n){
        this.name = n;
    }

    double getWidth(){
        return this.width;
    }
    double getHeight(){
        return this.height;
    }
    String getName(){
        return this.name;
    }

    abstract double area();
    Shapes(){
        this.width = this.height = 0.0;
    }
    Shapes(double w, double h, String n){
        this.width = w;
        this.height = h;
        this.name = n;
    }
    Shapes(Shapes s){
        this.width = s.width;
        this.height = s.height;
        this.name = s.name;
    }
}

class Rectangle extends Shapes{
        String style;

        Rectangle(){
            super();
            this.style = "none";
        }

        double area(){
            return this.getWidth() * this.getHeight()/2;
        }

        Rectangle(double w, double h, String s){
            super(w, h, "Rectangle");

            this.style = s;
        }
        Rectangle(Rectangle s){
            super(s);
            this.style = s.style;
        }
}


public class learnAbstractClass {
    public static void main(String[] args){
        Rectangle rec = new Rectangle();
        Rectangle rec1 = new Rectangle(12.0, 23.0, "Filled");

  
        System.out.println(rec.area());
        System.out.println(rec.getName());
        System.out.println(rec1.area());
        System.out.println(rec1.getName());
    }
}
