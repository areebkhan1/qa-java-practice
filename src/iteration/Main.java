package iteration;

public class Main {
    public static void main(String[] args) {
        //for loop for a specified amount of times or looping through a data structure
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        //while loop, work primarily with a boolean value, e.g. while a value is true do the loop.
        int sandwiches = 0;
        boolean notEnoughSandwiches = true;
        while (notEnoughSandwiches) {
            System.out.println("add another sandwich");
            sandwiches++;

            if (sandwiches > 382) {
                notEnoughSandwiches = false;
            }
        }
        System.out.println("I now have too many sandwiches");

        // do while loop, it's a while loop that always runs at least once.
        int cupsOfTea = 2;
        boolean notEnoughCupsOfTea = false;

        do {
            System.out.println("get anotha cuppa");
            cupsOfTea++;
            if (cupsOfTea >= 2) {
                notEnoughCupsOfTea = false;
            }
        } while (notEnoughCupsOfTea);
        System.out.println("We have enough tea");


        //transfer and control statements

        for (int i = 0; i<10; i++){
            if(i == 2){
                continue;
            }

            if(i == 7) {
                break;
            }
            System.out.println(i);
        }
    }
}
