package calculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a number");
        double x = scanner.nextDouble();
        System.out.println("enter another number");
        double y = scanner.nextDouble();

        System.out.println("enter an operator");
        String operator = scanner.next();
      switch(operator){
          case "+":
              System.out.println(x+y);
              break;
          case "-":
              System.out.println(x-y);
              break;
          case "*":
              System.out.println(x*y);
              break;
          case "/":
              System.out.println(x/y);
              break;
          case "%":
              System.out.println(x%y);
              break;
          case "^":
              System.out.println(Math.pow(x, y));
              break;
          default:
              System.out.println("invalid operator, must be +. -. *. /, ^, %");
              break;
      }
    }
}
