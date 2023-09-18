package car;

public class Car{
    private String colour;
    private String reg;

    private String model;

    private String make;

    private double miles;

    private Position pos;

    public Car(String colour, String reg, String model, String make, double miles) {
        this.colour = colour;
        this.reg = reg;
        this.model = model;
        this.make = make;
        this.miles = miles;
        this.pos = new Position(0,0 );
    }


    public void increaseMiles(double increaseBy){
        this.miles += increaseBy;
    }
    public String getColour(){
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getMiles() {
        return miles;
    }

    public void setMiles(double miles) {
        this.miles = miles;
    }

    public Position getPos() {
        return pos;
    }

    public void setPos(Position pos) {
        this.pos = pos;
    }
}
