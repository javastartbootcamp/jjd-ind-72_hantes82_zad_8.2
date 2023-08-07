package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        double basicPrice = 100;
        double discount = 0.05;
        double serviceFee = 5;
        int choice;
        Address address = new Address("Łopuszańska", 36, "04-373", "Warszawa");

        do {
            System.out.println("Wybierz rodzaj biletu i wpisz odpowiadający mu numer: ");
            System.out.printf("1. Bilet standardowy\n2. Bilet Online\n3. Bilet Podarunkowy\n");
            choice = scr.nextInt();
        } while (choice < 1 || choice > 3);

        Ticket ticket = generateTicket(choice, basicPrice, discount, serviceFee);
        Event event = new Event("Koncert grupy Perfect", address, ticket);
        event.printInfo();
    }

    public static Ticket generateTicket(int choice, double basicPrice, double discount, double serviceFee) {
        if (choice == 1) {
            return new TicketStandard(basicPrice, discount, serviceFee);
        } else if (choice == 2) {
            return new TicketOnline(basicPrice, discount);
        } else {
            return new TicketGift(basicPrice, discount, serviceFee);
        }
    }
}
