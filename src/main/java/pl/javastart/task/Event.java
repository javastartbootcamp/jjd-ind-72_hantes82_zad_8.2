package pl.javastart.task;

public class Event {
    private String eventName;
    private Address address;

    public Event(String eventName, Address address) {
        this.eventName = eventName;
        this.address = address;
    }

    void printInfo() {
        System.out.println("Nazwa wydarzenia: " + eventName);
        address.printInfo();
    }

}
