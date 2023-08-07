package pl.javastart.task;

public class TicketStandard extends Ticket {
    String type = "Standard";
    private int uniqNumber;

    public TicketStandard(double price, double discount, double serviceFee) {
        super(price, discount, serviceFee);
        uniqNumber = getNumber();
    }

    public double generatePrice(double serviceFee) {
        double result = TicketStandard.super.getPrice()
                - TicketStandard.super.getPrice() * TicketStandard.super.getDiscount() + serviceFee;
        return result;
    }

    public String getType() {
        return type;
    }

    private void setUniqNumber(int uniqNumber) {
        this.uniqNumber = uniqNumber;
    }

    public int getUniqNumber() {
        return uniqNumber;
    }

    @Override
    protected void printInfo() {
        System.out.printf("Typ biletu: %s\n", getType());
        super.printInfo();
        System.out.println();
        System.out.printf("Cena ostateczna: %.2f\n", generatePrice(getServiceFee()));
        System.out.printf("Numer biletu: %d", getUniqNumber());

    }
}
