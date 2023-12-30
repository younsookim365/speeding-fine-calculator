package speedingfinecalculator;

public class SpeedingFines extends Fine
implements iFine {
    //Constructor that accepts the citizen name and speed as parameters
    public SpeedingFines(String name, int speed) {
        super(name, speed);
    }
    //Override
    //Method which displays the citizen name, speed and the total fine due
    @Override   
    public void PrintFine() {
        System.out.println("********************************");
        System.out.println("PERSON: " + getName());
        System.out.println("SPEED: " + getSpeed() + "km");
        System.out.println("FINE PAYABLE: R " + getFine());
        System.out.println("********************************");
    }
}
