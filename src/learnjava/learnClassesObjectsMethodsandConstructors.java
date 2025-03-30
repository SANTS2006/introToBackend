package learnjava;

public class learnClassesObjectsMethodsandConstructors {
    public static void main(String[] args){
        Vehicle minivan = new Vehicle(7, 16, 21);
        Vehicle sportscar = new Vehicle(2,14, 12);

        learnConstructors lc = new learnConstructors();
        System.out.println("The value stored in the constructor is " + lc.x);

        learnConstructors lc1 = new learnConstructors(19);
        System.out.println("The value stored in the parameterized constructor is " + lc1.x);

//        Vehicle car1 = new Vehicle();
//        Vehicle car2 = car1;
//
//        car1.MPG = 26;
//
//        System.out.println(car1.MPG);
//        System.out.println(car2.MPG);

        int range1, range2;
        double gallons;

//        minivan.passengers = 7;
//        minivan.fuelCapacity = 16;
//        minivan.MPG = 21;
//
//        sportscar.passengers = 2;
//        sportscar.fuelCapacity = 14;
//        sportscar.MPG = 12;

        range1 = minivan.range();
        range2 = sportscar.range();

        gallons = minivan.fuelNeeded(252);

        System.out.println("To go a distance of 252km, minivan needs " + gallons + " of fuel");

        gallons = sportscar.fuelNeeded(300);

        System.out.println("To go a distance of 252km, sportscar needs " + gallons + " of fuel");

        System.out.println("Minivan can carry " + minivan.passengers + " passengers with range of " + range1 + " miles.");
        //minivan.range();
        System.out.println("Sportscar can carry " + sportscar.passengers + " passengers with range of " + range2 + " miles.");
        //sportscar.range();
    }
}
