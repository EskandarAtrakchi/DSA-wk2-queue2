package bookingsystem;

/**
 *
 * @author EskandaeAtrakchi
 */
public class TicketHolder {
    
    //private final variables 
    private final String name;
    private final String mobile;
    private final int ticketNumber;

    // Constructor
    public TicketHolder(String name, String mobile, int ticketNumber) {
        this.name = name;
        this.mobile = mobile;
        this.ticketNumber = ticketNumber;
    }

    // Getter methods only as they will be setted by the user
    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    //toString method 
    @Override
    public String toString() {
        return "Name: " + name + ", Mobile: " + mobile + ", Ticket Number: " + ticketNumber;
    }
}

