package conditionalexercise;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        /*
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }

        int c = scanner.nextInt();
        if(c % 2 == 0){
            System.out.println("c is even");
        }else{
            System.out.println("c is odd");
        }

        scanner.nextLine(); //consumes the newline character left in the input buffer.

        String trafficLight = scanner.nextLine();
        if(trafficLight.equals("red")){
            System.out.println("STOP");
        }
        else if (trafficLight.equals("yellow")){
            System.out.println("Get ready");
        }
        else if(trafficLight.equals("green")){
            System.out.println("Go");
        }
        else{
            System.out.println("not a valid traffic light colour.");
        } */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 12");
        int num12 = scanner.nextInt();

        switch (num12) {
            case 1:
            case 2:
            case 11:
            case 12:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Invalid month, enter a number between 1-12");
                break;
        }




    }
}
