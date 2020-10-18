package exercise3;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a;
        double b;
        double c;
        do {
          System.out.println("Enter a value for a: ");
          a = input.nextDouble();
          System.out.println("Enter a value for b: ");
          b = input.nextDouble();
          System.out.println("Enter a value for c: ");
          c = input.nextDouble();
          boolean fiki = a > 0 && b > 0 && c > 0 && b+c>a && a+c>b && a+b>c;
          if (fiki){
            double s = (a + b + c) / 2.0;
            double Area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.println("Area: " + Area);
            if (a == b && b == c ){
             System.out.println("Triangle: equilateral" );
            } else if ( a == b || a == c || b == c){
             System.out.println("Triangle: isosceles");
            } else  {
              System.out.println("Triangle: scalene");
            }
          } else {
            System.out.println("Values are not correct! ");
            
          }
             break; 
        } while ( a > 0 || b > 0 || c > 0);

    }

}
