package learnjava;

public class learnthiskeyword {
    public static void main(String[] args){
        Power power = new Power(4.0, 4);
        Power power1 = new Power(2.5, 1);
        Power power2 = new Power(5.7, 0);

        System.out.println(power.b + " raised to the " + power.e + " power is " + power.getPower());
        System.out.println(power1.b + " raised to the " + power1.e + " power is " + power1.getPower());
        System.out.println(power2.b + " raised to the " + power2.e + " power is " + power2.getPower());
    }
}
