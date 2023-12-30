package speedingfinecalculator;

import java.util.Scanner;

/*----------------------------------------------start---------------------------------------------------------*/
//Console application that will print the fine due for a citizen who was caught speeding in a 120km zone
public class SpeedingFineCalculator {
   
    /*-------------------------------------main method start--------------------------------------------------*/
    public static void main(String[] args) {
        String name;
        int speed;
        
        //Scanner class to capture the input 
        Scanner application = new Scanner(System.in);
        System.out.print("Enter the person name: ");
        name = application.nextLine();
        System.out.print("Enter the speed: ");
        speed = Integer.parseInt(application.nextLine());      
        
        //Instantiating the SpeedingFInes class
        SpeedingFines fine = new SpeedingFines(name, speed); 
        
        //Calling PrintFine method
        fine.PrintFine();
    } 
    /*-------------------------------------main method end---------------------------------------------------*/ 
} 
/*----------------------------------------------end----------------------------------------------------------*/