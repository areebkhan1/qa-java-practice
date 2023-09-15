package conditionalexercise;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
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
        }
    }
}
