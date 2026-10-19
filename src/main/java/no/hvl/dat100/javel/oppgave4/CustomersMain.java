package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

import java.util.Arrays;

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

        // Getting specific customer
        GetCustomer(1001);

        // Remove specific customer
        RemoveCustomer(1002);

        // Get all customers
        GetAllCustomers();

    }

    public static void CountNonNull() {
        System.out.println("You have: " + testCustomers.countNonNull() + " customers.");
    }

    public static void AddCustomer() {
        testCustomers.addCustomer(alice);
        testCustomers.addCustomer(bob);
        testCustomers.addCustomer(charlie);
        testCustomers.addCustomer(diana);
        testCustomers.addCustomer(ethan);
    }

    public static void GetCustomer(int id) {
        System.out.println("Your customer is: " + testCustomers.getCustomer(id).getName());
    }

    public static void RemoveCustomer(int id) {
        Customer c = testCustomers.getCustomer(id);

        if (c != null) {
            String name = c.getName();
            testCustomers.removeCustomer(id);
            System.out.println("You removed customer: " + name);
        }
        else {
            System.out.println("Could not find the designated customer.");
        }
    }

    public static void GetAllCustomers() {
        Customer[] c = testCustomers.getCustomers();

        String[] names = new String[c.length];

        for (int i = 0; i < c.length; i++) {
            names[i] = c[i].getName();
        }

        System.out.println(Arrays.toString(names));
    }

}
