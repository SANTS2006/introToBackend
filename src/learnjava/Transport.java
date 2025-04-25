package learnjava;

public enum Transport {
    CAR(65, "Range Rover"), TRUCK(55, "Virkin"), AIRPLANE(600, "Boeing 737"), TRAIN(70, "US Fast"), BOAT(22, "Roulette");

    private int speed;
    private String name;

    Transport(int s, String n){
        this.speed = s;
        this.name = n;
    }

    int getSpeed(){
        return this.speed;
    }
    String getName(){
        return this.name;
    }
}
