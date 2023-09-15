package loopsexercise;

public class Main {
    public static void main(String[] args) {

        // q1while version
        int a = 0; //initialise
        while(a < 10){//condition
            System.out.println(a);
            a++;//increment
        }

int b = 0;
        do{
            System.out.println(b);
            b++;
        }
        while(b<9);

int c = 0; int d = 10;
while(c < d){
    System.out.println("c = " + c);
    System.out.println("d =" + d);
    c++;
    d--;
}

//do while version q2
        int e = 0;
int f = 10;
          do{
              System.out.println("e = " + e);
              System.out.println("f =" + f);
              e++;
              f--;
          }while(e < f);


          int sum = 0;
          while(sum < 10){
              sum++;
          }

          //do while q3

        int sum2 = 0;
          do{
              sum2++;
          } while(sum2<10);
}
    }
