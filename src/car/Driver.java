package car;

public class Driver {
    private Car driverCar;
    private Position driverPos;

    public Driver(Car driverCar) {
        this.driverCar = driverCar;
    }

    public Car getDriverCar() {
        return driverCar;
    }

    public void setDriverCar(Car driverCar) {
        this.driverCar = driverCar;
    }


    //Drive method
    public void Drive(int miles){
        this.driverCar.increaseMiles(miles);
    }

    public void changePos(double x, double y){
        driverCar.getPos().setX(x);
        driverCar.getPos().setY(y);
    }
}
