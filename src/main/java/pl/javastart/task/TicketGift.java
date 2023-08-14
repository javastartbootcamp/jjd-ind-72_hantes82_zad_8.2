package pl.javastart.task;

public class TicketGift extends TicketStandard {
    private String type = "Gift";

    public TicketGift(double price, double discount, double serviceFee, Event event) {
        super(price, discount, serviceFee, event);
    }

    public double generatePrice() {
        double result = super.generatePrice() + ((basicPrice - basicPrice * discount) * discount);
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
