import java.util.*;

public class conditional_statement {
  public static int GreatNum(int A, int B){
    if (A > B) {
      return A;
    }
    else{
      return B;
    }
  }

  public static void isAdult(int age){
    if(age >= 18){
      System.out.println("Adult and they can drive if they have licence. They can give vote also");
    }
    else{
      System.out.println("Not adult");
    }
  }

  public static void OddorEven(int num){
    if(num %2 == 0){
      System.out.println("This number is even.");
    }
    else{
      System.out.println("This number is odd.");
    }
  }

  public static void TotalTax(int income){
    int tax;
    if(income < 500000){
      tax = 0;
    }
    else if(income>= 500000 && income < 1000000){
      tax = (int)(income * 0.2);
    }
    else{
      tax = (int)(income * 0.3);
    }

  System.out.println("Your tax is " + tax);
  }

  public static void largFthree(int a, int b, int c){
    if((a >= b) && (a >= c)){
      System.out.println(a + " is the greatest number.");
    }else if(b >=c){
      System.out.println(b + " is the greatest number.");
    }else{
      System.out.println(c + " is the greatest number.");
    }
    
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    /* -----------largest from 2 number-----*/
    int A = sc.nextInt();
    int B = sc.nextInt();

    System.out.println("The Greatest Number From " + A + " and " + B + " is "  + GreatNum(A, B));

    /* ---- is Adult or not---- */

    int age = sc.nextInt();
    isAdult(age);

    /* ---- Even or odd---- */

    System.out.println("Enter a number: ");
    int num = sc.nextInt();
    OddorEven(num);

    /* Income tax calculator */
    System.out.println("Enter your income: ");
    int income = sc.nextInt();

    TotalTax(income);

    /* largest from 3 number */

    System.out.println("Enter there number: ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    largFthree(a, b, c);


  }
}
