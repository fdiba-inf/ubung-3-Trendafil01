package exercise3;

import java.util.Scanner;

public class NumberCounter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int positive = 0;
        int negative = 0;
        double sum = 0;
        int average = 0;
        int count = 0;
        int number= input.nextInt();
        while ( number !=0 ){
          if (number>0){
            positive++;
          } else {
            negative++;
          }
          count++;
          sum = sum + number;
          number= input.nextInt();
        }
        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + sum/count);
      
    }

}
