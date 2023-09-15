package fizzbuzzextension;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number you want to stop fizzbuzzing at");
        int stop = scanner.nextInt();

        for(int i = 0; i <= Math.abs(stop); i++) {

        if (i%3 == 0 && i%5 == 0 ){
            System.out.println("fizzbuzz");
        }else if (i % 3 == 0) {
                System.out.println("fizz");
            }else if (i % 5 == 0) {
                System.out.println("buzz");
            }else{
            System.out.println(i);
        }
        }
    }

}
