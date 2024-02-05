package bookingsystem;

import java.util.Scanner;

/**
 *
 * @author EskandaeAtrakchi
 */
public class BookingSystemApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Scanner for user input 
        Scanner input = new Scanner (System.in); 
        QueueInterface qi = new BookingSystem ();
        
        //keep looping
        while (true) {
            
            //choices block 
            System.out.println("""
                           Please Select the following: 
                           number 1 for checking on the size of the array
                           number 2 for isEmpty
                           number 3 to dequeue
                           number 4 to enqueue
                           number 5 to show a list of all tickets
                           number 6 to exit 
                           """);
            
            //choice variable for the user to select 
            String choice = input.nextLine();
            
            //if statements and calling methods accordingly 
            if (choice.equalsIgnoreCase("1")) {
            
            qi.size();
            
            } else if (choice.equalsIgnoreCase("2")) {

                qi.isEmpty();

            } else if (choice.equalsIgnoreCase("3")) {

                qi.dequeue();

            } else if (choice.equalsIgnoreCase("4")) {

                qi.enqueue();

            } else if (choice.equalsIgnoreCase("5")) {

                qi.display();

            } else if (choice.equalsIgnoreCase("6")) {
             
                System.exit(0);
                
            } else {

                System.out.println("Wrong choice!");

            }
        }
    }
}
