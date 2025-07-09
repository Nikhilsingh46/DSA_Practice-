import java.util.*;

public class PLQ {

  public static void printHello(int count){
    int counter = 0;

    while (counter <= count) {
      System.out.println("Hello World!");
      counter++;
    }
  }

  public static void printNumber1toN(int n){
    int a = 1;
    while (a<=n ) {
      System.out.print(a + " ");
      a++;
    }
    System.out.println();
  }

  public static void SumoNnum(int number){
    int i = 1;
    int sum = 0;
    while (i<= number) {
      sum += i;
      i++;
    }

    System.out.println("Sum of " + number + " natural numbers is " + sum + " .");
  }

  public static void printStar(int n){
    for(int i = 1; i<= n ; i++){
      System.out.println("* * * *");
    }
  }

  public static void printReverse(int Number){
    int rev = 0;
    while (Number > 0) {
      int l = Number % 10;
      Number = Number / 10;

      rev = (rev * 10) + l;
      System.out.println(rev);
    }

    System.out.println("Reverse of given number  is " + rev);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // int count = sc.nextInt();
    // printHello(count);

    int num  = sc.nextInt();
    // printNumber1toN(num);

    // SumoNnum(num);
    // printStar(num);
    printReverse(num);
  }


}
