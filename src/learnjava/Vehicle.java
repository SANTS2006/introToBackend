package learnjava;

public class Vehicle {
    int passengers;
    int fuelCapacity;
    int MPG;

    Vehicle(int p, int fC, int mPG){
        passengers = p;
        fuelCapacity = fC;
        MPG = mPG;
    }


    /* void range(){
        System.out.println("The Range is " + fuelCapacity * MPG);
    }*/
    //Returning a value from the range
    int range(){
        return fuelCapacity * MPG;
    }

    double fuelNeeded(int miles) {
        return (double) miles / MPG;
    }
}
