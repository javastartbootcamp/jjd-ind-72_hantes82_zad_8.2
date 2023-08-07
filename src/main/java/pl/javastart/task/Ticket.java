package pl.javastart.task;

public class Ticket {

    private double basicPrice;
    private double discount;
    private double serviceFee;
    private static int number;

    public Ticket(double price, double discount, double serviceFee) {
        this.basicPrice = price;
        this.discount = discount;
        this.serviceFee = serviceFee;
        setNumber(Ticket.getNumber() + 1);
    }

    public Ticket(double basicPrice, double discount) {
        this.basicPrice = basicPrice;
        this.discount = discount;
        setNumber(Ticket.getNumber() + 1);

    }

    public static int getNumber() {
        return number;
    }

    protected static void setNumber(int number) {
        Ticket.number = number;
    }

    public double getPrice() {
        return basicPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public double getServiceFee() {
        return serviceFee;
    }

    protected void printInfo() {
        System.out.printf("Cena podstawowa: %.2f\n", getPrice());
        System.out.printf("Zniżka: %d \n", (int) (getDiscount() * 100));
    }
}


