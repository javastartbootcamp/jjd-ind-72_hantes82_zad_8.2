package pl.javastart.task;

public class TicketOnline extends Ticket {
    String type = "Online";

    public TicketOnline(double price, double discount, Event event) {
        super(price, discount, event);
    }

    public double generatePrice() {
        double result = basicPrice - basicPrice * discount;
        return result;
    }

    @Override
    protected void printInfo() {
        System.out.printf("Typ biletu: %s\n", type);
        super.printInfo();
        System.out.println();
        System.out.printf("Cena ostateczna: %.2f\n", generatePrice());
        System.out.printf("Numer biletu: %d", uniqeNumber);
    }

}
