package exercise3;

import java.util.Scanner;

public class Triangle {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double a = input.nextDouble();
    double b = input.nextDouble();
    double c = input.nextDouble();
    double s = 0;
    double area = 0;

    do {
      if (a > 0 && b > 0 && c > 0 && a + b > c && b + c > a && a + c > b) {

        s = (a + b + c) / 2.0;
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area: " + area);
        if (a == b && b == c) {
          System.out.println("Triangle: equilateral");

        } else if (a == b || a == c || b == c) {
          System.out.println("Triangle: isosceles");
        } else if (a != b && b != c && a != c) {
          System.out.println("Triangle: scalene");
        }
      } else {
        System.out.println("Values are not correct!");
      }
      a = input.nextDouble();
      b = input.nextDouble();
      c = input.nextDouble();

    } while (a > 0 && b > 0 && c > 0);
  }
}