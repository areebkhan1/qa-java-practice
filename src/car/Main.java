package car;

public class Main {
    public static void main(String[] args) {

        Car myCar = new Car("Black", "ABC123", "Golf", "Volkswagen", 13400.24 );


        //Test Car Get
        System.out.println(myCar.getColour());

        //Test car setter
        myCar.setColour("Red");
        System.out.println(myCar.getColour());

        //increase miles
        myCar.increaseMiles(50.24);


        //Test driver
        Driver myDriver = new Driver(myCar);
        System.out.println(myDriver.getDriverCar());

        //Test drive
        myDriver.Drive(20);
        System.out.println(myDriver.getDriverCar());


    }
}
