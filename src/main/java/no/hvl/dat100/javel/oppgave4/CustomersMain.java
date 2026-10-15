package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class CustomersMain {

    static Customers testCustomers = new Customers(5);

    static Customer alice = new Customer("Alice Smith",
            "alice@example.com", 1001, PowerAgreementType.SPOTPRICE);

    static Customer bob = new Customer("Bob Johnson",
            "bob@example.com", 1002, PowerAgreementType.NORGESPRICE);

    static Customer charlie = new Customer("Charlie Rose",
            "charlie@example.com", 1003, PowerAgreementType.POWERSUPPORT);

    static Customer diana = new Customer("Diana Prince",
            "diana@justice-league.com", 1004, PowerAgreementType.NORGESPRICE);

    static Customer ethan = new Customer("Ethan Hunt",
            "ethan@scientology.com", 1005, PowerAgreementType.POWERSUPPORT);

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        System.out.println();

        // Adding customers
        AddCustomer();

        // Counting the customers
        CountNonNull();

    }

    public static void CountNonNull() {
        System.out.println("You have: " + testCustomers.countNonNull());
    }

    public static void AddCustomer() {
        testCustomers.addCustomer(alice);
        testCustomers.addCustomer(bob);
        testCustomers.addCustomer(charlie);
        testCustomers.addCustomer(diana);
        testCustomers.addCustomer(ethan);
    }

}
