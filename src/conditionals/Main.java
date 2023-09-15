package conditionals;

public class Main {
    public static void main(String[] args) {
        boolean isLightOn = false;

        if(isLightOn == true){
            System.out.println("I can see");

        }
        else {
            System.out.println("It's dark");
        }

        //VARS
        Integer number = 10;
        // Is equal to
        if (number == 8){
            System.out.println("number is 8");
        }else{
            System.out.println("number is not 8");
        }
        //Is Not equal to
        if(number != 10){
            System.out.println("number is not 10");
        }
        else {
            System.out.println("number is 10");
        }

        //less than
        if(number < 20){
            System.out.println("number is less than 20");
        }
        //AND operator
        if (number > 3 && number < 11){
            System.out.println("number is greater than 3 and less than 11");
        }

        //OR
        if (number == 1 || number == 10){
            System.out.println("number is 1 or 10");
        }

        //type checking doesn't work with a primitive type, works in an object
        if (number instanceof Integer){
            System.out.println("number is an integer");
        }

        //if else
        if(number == 1){

        } else if(number ==4){
            System.out.println("four aint bad");
        }
        else if(number ==4){
            System.out.println("number is 10");
        } else{
            System.out.println("here we are");
        }

        //SWITCH CASE, use instead of big if else trees, more efficient
        int day;
        day = 5;

        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thur");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("Invalid");

        }
    } // technically switch cases are actually loops. so you have to break otherwise it'll keep going

//For instanceof you can't evaluate primitives, you'll have to use a wrapper.

}
