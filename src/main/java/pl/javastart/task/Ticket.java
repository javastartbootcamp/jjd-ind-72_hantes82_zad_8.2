package pl.javastart.task;

public class Ticket {

    protected double basicPrice;
    protected double discount;
    protected double serviceFee;
    protected static int number = 0;
    protected int uniqeNumber = 0;

    protected Event event;

    public Ticket(double basicPrice, double discount, double serviceFee, Event event) {
        this.basicPrice = basicPrice;
        this.discount = discount;
        this.serviceFee = serviceFee;
        this.event = event;
        number += 1;
        this.uniqeNumber = number;

    }

    public Ticket(double basicPrice, double discount, Event event) {
        this.basicPrice = basicPrice;
        this.discount = discount;
        this.event = event;
        number += 1;
        this.uniqeNumber = number;
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
        System.out.printf("Cena podstawowa: %.2f\n", basicPrice);
        System.out.printf("Zniżka: %d \n", (int) (discount * 100));
    }
}


