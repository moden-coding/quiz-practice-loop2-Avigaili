/**
 *  Write code that reads a series of test scores (as integers) from the user until the user 
 *  enters -1. Keep track of the highest and lowest test score. When the user enters '-1', print out
 *  the highest and lowest scores with an appropriate message i.e. "The high score was ...."
 */


import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
    
        
        int high = 0;
        int low = 100;

        
        while(true) {
            System.out.println("Give a number:");
            int imput = Integer.valueOf(scanner.nextLine());
            if (imput == -1) {
             break;
        }
         
          if (imput > high ) {
            high = imput;
            
        } if (imput <low ){
            low = imput;
            
        }
        }
        System.out.println("The high score was " + high + " and the lowest score was " + low);
    }
}
    

