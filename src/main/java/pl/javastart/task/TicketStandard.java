package pl.javastart.task;

public class TicketStandard extends Ticket {
    String type = "Standard";

    public TicketStandard(double price, double discount, double serviceFee, Event event) {
        super(price, discount, serviceFee, event);
    }

    public double generatePrice() {
        double result = basicPrice - basicPrice * discount + serviceFee;
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
