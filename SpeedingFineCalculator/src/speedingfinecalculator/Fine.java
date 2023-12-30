package speedingfinecalculator;

public abstract class Fine {
    //Variables to store the citizen name, speed, and fine payable
    private String name;
    private int speed;
    private double fine;
    
    //Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(int speed) {
        if(speed >= 120) {    
            this.fine = speed*10.20;
        } else {    
            this.fine = 0;
        }
    }
   
    //Constructor that accepts the citizen name and speed as parameters
    public Fine(String name, int speed) {
        this.name = name;
        this.speed = speed;
        setFine(speed);
    }
}