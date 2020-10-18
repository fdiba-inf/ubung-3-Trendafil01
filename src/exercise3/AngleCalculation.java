package exercise3;

import java.util.Scanner;

public class AngleCalculation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       double  value = input.nextDouble();
       
       char type = input.next().charAt(0);
       do{
        if (type == 'd'){
          double R = value * Math.PI / 180 / 2;
          System.out.println("Angle: " + R);

        }else if ( type == 'r' ){
          double R = 2 * value * 57.295;
          System.out.println("Angle: " + R);
        }
        break;
       } while (type == 'd'  || type == 'r');
        

    }

}