import java.util.Comparator;
public class Ticket {
    private int row ;
    private int seat ;
    private int price ;

    private Person person ; // To create an object of Person class

    public Ticket(int row , int seat , int price , Person person) {
        this.row = row ;
        this.seat = seat ;
        this.price = price ;
        this.person = person ;
        
    }

    //Method to print all the ticket details
    public void Print() {
        System.out.println("Person name: " + person.getName());
        System.out.println("Person surname: " + person.getSur_Name());
        System.out.println("Person email: " + person.getEmail());
        System.out.println("Row: " + row);
        System.out.println("Seat: " + seat);
        System.out.println("Ticket Price : " + price +"$");
        System.out.println() ;
    }

    // Return the price
    public int getPrice() {

        return price   ;
    }

    public int getRow() {
        return row ;
    }

    public int getSeat() {
        return seat;
    }
}
