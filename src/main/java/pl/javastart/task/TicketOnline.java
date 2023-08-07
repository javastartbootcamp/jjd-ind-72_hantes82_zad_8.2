package pl.javastart.task;

public class TicketOnline extends Ticket {
    String type = "Online";
    private int uniqNumber;

    public TicketOnline(double price, double discount) {
        super(price, discount);
        uniqNumber = getNumber();
    }

    public double generatePrice() {
        double result = TicketOnline.super.getPrice() - TicketOnline.super.getPrice() * TicketOnline.super.getDiscount();
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
        System.out.printf("Cena ostateczna: %.2f\n", generatePrice());
        System.out.printf("Numer biletu: %d", getUniqNumber());
    }

}
