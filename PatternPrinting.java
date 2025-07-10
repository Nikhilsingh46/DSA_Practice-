package Pattern_Printing;


import java.util.*;

public class PatternPrinting {
  public static void rightTriangle(int n){
    for(int i = 1; i<=n; i++){
      for(int j = 1; j<=i ; j++){
        System.out.print("* ");
      }
      System.out.println(" ");
    }
  }

  public static void invertedStar(int n){
    // for(int i = 0; i<=n; i++){
    //   for(int j = n; j>i ; j--){
    //     System.out.print("* ");
    //   }
    //   System.out.println(" ");
    // }

    for(int i = 1; i<=n; i++){
      for(int s= 1; s<=(n-i+1); s++){
        System.out.print(" * ");
      }
      System.out.println(" ");
    }
  }

  public static void halfPyramid(int n){
    for(int i =1; i<=n; i++){
      for(int j = 1; j<= i; j++){
        System.out.print(j + " ");
      }
      System.out.println(" ");
    }
  }

  public static void hollowRectangle(int totalRow, int totalCol){
    for(int i =1; i<=totalRow; i++){
      for(int j = 1; j<= totalCol; j++){
        if(i == 1 || i == totalRow || j == 1 || j == totalCol){
          System.out.print(" *");
        }else{
          System.out.print("  ");
        }
      }
      System.out.println(" ");
    }
  }

  public static void halfInvertedTriangle(int n){
    for(int i = 1; i<=n; i++){
      //space
      for(int j = 1; j<= (n-i); j++){
        System.out.print("  ");
      }
      //star 
      for(int j = 1; j<=i; j++){
        System.out.print(" *");
      }
      System.out.println(" ");
    }
  }
  
  public static void invertedNumberTriangle(int n){
    for(int i = 1; i<=n; i++){
      for(int j =1; j<=(n-i + 1); j++){
        System.out.print(" " + j);
      }
      System.out.println( );
    }
  }

  public static void floydTriangle(int n){
    int counter = 1;
    for(int i= 1; i<= n; i++){
      for(int j = 1; j<= i; j++){
        System.out.print(counter + " ");
        counter++;
      }
      System.out.println();
    }
  }

  public static void zero_one_Triangle(int n){
    for(int i= 1; i<= n; i++){
      for(int j = 1; j<= i; j++){
        if((i+j)%2 == 0){
          System.out.print(" 1");
        }else{
          System.out.print(" 0");
        }
      }
      System.out.println( );
    }
  }

  public static void butterfly(int n){
    //1st half
    for(int i = 1; i<= n; i++){
      //star
      for(int j = 1; j<=i; j++){
        System.out.print("* ");
      }

      //space
      for(int j = 1; j<= 2*(n-i); j++){
        System.out.print("  ");
      }
      for(int j = 1; j<=i; j++){
        System.out.print("* ");
      }
      System.out.println();
    }
    //2nd half
    for(int i=n; i>=1; i--){
      //star
      for(int j = 1; j<=i; j++){
        System.out.print("* ");
      }

      //space
      for(int j = 1; j<= 2*(n-i); j++){
        System.out.print("  ");
      }
      for(int j = 1; j<=i; j++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  public static void solid_rhombus(int n){
    for(int i =1; i<=n; i++){
      //space
      for(int j = 1; j<=(n-i); j++){
        System.out.print("  ");
      }

      //stars
      for(int j =1; j<=n; j++){
        System.out.print(" *");
      }
      System.out.println();
    }
  }

  public static void hollow_rhombus(int n){
    for(int i =1; i<=n; i++){
      //space
      for(int j = 1; j<=(n-i); j++){
        System.out.print("  ");
      }

      //stars
      for(int j =1; j<=n; j++){
        if(i == 1 || i == n || j == 1 || j == n){
          System.out.print(" *");
        }else{
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }
  public static void diamond(int n){
    //1st half
    for(int i = 1; i<=n; i++){
      //space
      for(int j = 1; j<= (n-i); j++){
        System.out.print("  ");
      }
      //stars
      for(int j = 1; j<=((2*i)-1); j++){
        System.out.print(" *");
      }
      System.out.println();
    }
    //2nd half
    for(int i = n; i>= 1;i--){
      //space
      for(int j = 1; j<= (n-i); j++){
        System.out.print("  ");
      }
      //stars
      for(int j = 1; j<=((2*i)-1); j++){
        System.out.print(" *");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    // int totalRow = sc.nextInt();
    // int totalCol = sc.nextInt();
    // rightTriangle(n);
    // invertedStar(n);
    // halfPyramid(n);
    // hollowRectangle(totalRow, totalCol);
    // halfInvertedTriangle(n);
    // invertedNumberTriangle(n);
    // floydTriangle(n);
    // zero_one_Triangle(n);
    // butterfly(n);
    // solid_rhombus(n);
    // hollow_rhombus(n);
    diamond(n);
  }
}
