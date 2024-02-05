package bookingsystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author EskandaeAtrakchi
 */
public class BookingSystem implements QueueInterface {

    //Scanner to take user input 
    Scanner input = new Scanner(System.in);

    //private and final (unchangeable arraylist 
    private final ArrayList < TicketHolder > bList;

    //constructor to assign the arraylist 
    public BookingSystem() {
        bList = new ArrayList <> ( );
    }

    @Override
    //if it is empty let the user know 
    public boolean isEmpty() {
        
        if (bList.isEmpty()) {
            
            System.out.println("The arraylist is empty ");
            
        } else {
            
            System.out.println("the arraylist is not empty ");
            
        }
        return bList.isEmpty();
    }

    @Override
    //print the size 
    public int size() {
        
        System.out.println("The size of the arraylist is : " + bList.size());
        return bList.size();
    
    }

    @Override
    // create an instance from the child class TicketHolder and wrap everything to an object and add the object to the arraylist 
    public void enqueue() {
    
        System.out.println("Please enter the details of the ticket holder:");
        System.out.print("Name: ");
        String name = input.next();
        System.out.print("Mobile: ");
        String mobile = input.next();
        System.out.print("Ticket Number: ");
        int ticketNumber = input.nextInt();

        TicketHolder newTicketHolder = new TicketHolder (name, mobile, ticketNumber);
        bList.add(newTicketHolder);
        System.out.println("Added successfully!");//let the user know 
    
    }

    @Override
    //let the user know if it is empty 
    public void dequeue() {
        
        if (isEmpty()) {
            
            System.out.println("Nothing there!");
            
        } else {
            
            System.out.println("Item removed successfully");
            bList.remove(0);
            
        }
    }

    @Override
    //calling the toString method to itorate through the arraylist 
    //the toString method is in the child class TicketHolder
    public String display() {
        String str = "";

        Iterator<TicketHolder> it = bList.iterator();

        if (isEmpty()) {
            str = str.concat("arraylist is empty");
        } else {
            while (it.hasNext()) {
                str = str.concat(it.next().toString());
                str = str.concat(" : ");
                System.out.println(str + "\n");
            }
        }
        return str;
    }
}
