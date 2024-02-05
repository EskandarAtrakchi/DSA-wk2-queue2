package bookingsystem;

/**
 *
 * @author EskandaeAtrakchi
 */
public interface QueueInterface {
    
    //abstract methods here 
    public void enqueue () ;
    public void dequeue () ;
    public int size () ;
    public boolean isEmpty () ;
    public String display ();
    
}
