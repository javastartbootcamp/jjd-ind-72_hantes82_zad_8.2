package pl.javastart.task;

public class TicketGift extends Ticket {
    private String type = "Gift";
    private int uniqNumber;

    public TicketGift(double price, double discount, double serviceFee) {
        super(price, discount, serviceFee);
        uniqNumber = getNumber();
    }

    public double generatePrice() {
        double result = TicketGift.super.getPrice()
                - TicketGift.super.getPrice() * TicketGift.super.getDiscount() + getServiceFee()
                + (TicketGift.super.getPrice() * TicketGift.super.getDiscount());
        return result;
    }

    public String getType() {
        return type;
    }

    public int getUniqNumber() {
        return uniqNumber;
    }

    private void setUniqNumber(int uniqNumber) {
        this.uniqNumber = uniqNumber;
    }

    @Override
    protected void printInfo() {
        System.out.printf("Typ biletu: %s\n", getType());
        super.printInfo();
        System.out.println();
        System.out.printf("Cena ostateczna: %.2f\n", generatePrice());
        System.out.printf("Numer biletu: %d", getUniqNumber());
    }

}
