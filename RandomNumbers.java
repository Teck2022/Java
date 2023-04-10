package math;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {

        Random random = new Random();
        int counter;
        
//      This will reflect on the size of your number
        int[] numbers = new int[ 500 ]; 
        
//      init first number
        numbers[0] = random.nextInt(1000); 
        
//      Set it as the smallest number
        int smallest = numbers[0]; 
        
        for (counter = 1 ; counter <  500; counter++) 
        {
            numbers[counter ] = random.nextInt(1000); 
            
//          Compare with previous smallest
            smallest = Math.min( smallest , numbers[counter ] );

        }
        
         System.out.println("Smallest number is : " +smallest);
      }
}



