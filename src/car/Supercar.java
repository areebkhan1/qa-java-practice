package car;

public class Supercar extends Car{

    private boolean sportsMode;
    public Supercar(String colour, String reg, String model, String make, double miles, boolean sportsMode) {
        super(colour, reg, model, make, miles);
        this.sportsMode = sportsMode;
    }

    public void turnOnSportsMode(){
        this.sportsMode = true;
    }

    public void turnOffSportsMode(){
        this.sportsMode = false;
    }

   package car;

    public class Supercar extends Car{

        private boolean sportsMode;
        public Supercar(String colour, String reg, String model, String make, double miles, boolean sportsMode) {
            super(colour, reg, model, make, miles);
            this.sportsMode = sportsMode;
        }

        public void turnOnSportsMode(){
            this.sportsMode = true;
        }

        public void turnOffSportsMode(){
            this.sportsMode = false;
        }

        @Override
        public void increaseMiles(double increaseBy) {
            if (sportsMode) {
                super.increaseMiles(increaseBy * 2);
            } else {
                super.increaseMiles(increaseBy); // Normal behavior
            }
        }
    }

}
