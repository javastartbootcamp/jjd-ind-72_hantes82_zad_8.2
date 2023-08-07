package pl.javastart.task;

public class Event {
    private String eventName;
    private Address address;

    Ticket ticket;

    public Event(String eventName, Address address, Ticket ticket) {
        this.eventName = eventName;
        this.address = address;
        this.ticket = ticket;
    }

    public Event(String eventName, Address address) {
        this.eventName = eventName;
        this.address = address;
    }

    void printInfo() {
        System.out.println("Nazwa wydarzenia: " + eventName);
        System.out.printf("Adres:\nUlica: %s nr %d\nKod pocztowy: %s\nMiasto: %s\n", address.getStreet(), address.getNumber(),
                address.getPostCode(), address.getCity());

        ticket.printInfo();
    }

}
