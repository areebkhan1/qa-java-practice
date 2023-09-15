package exercise2;

public class Main {
    public static void main(String[] args) {
        //q1
        int x = 3, y = 5;
      if(x >= 0){
          if (y<x){
              System.out.println("y is less than x");
          } else if (x < 0) {
              System.out.println("x is negative");
          }
      }

      //q2
      int z = 7;
      if (z==0){
          System.out.println("z is zero");
      }


      //q3
        int a =15, b=24;
      if(a % 2 ==0 && b%2 ==0){
          System.out.println("a and b are even numbers");
      } else if (a % 2 == 0 && b % 2 != 0) {
          System.out.println("a is even and b is odd");
      } else if (a % 2 != 0 && b % 2 == 0) {
          System.out.println("a is even and b is odd");
      }
      else{
          System.out.println("a and b are odd");
      }

    }
}
