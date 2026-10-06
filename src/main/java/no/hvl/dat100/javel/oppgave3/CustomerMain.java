package no.hvl.dat100.javel.oppgave3;

import no.hvl.dat100.javel.oppgave4.Customers;

public class CustomerMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 3");
        System.out.println("==============");
        System.out.println();

        /*
        TODO

         Write code that creates a Customer object and teste the methods implemented in the class
        */

        Customer c1 = new Customer("John","john@gmail.com",1001, PowerAgreementType.NORGESPRICE );

        System.out.println("Customer number: " + c1.getCustomer_id());
        c1.setCustomer_id(1002);

        System.out.println("Name: " + c1.getName());
        c1.setName("Frank");

        System.out.println("Email: " + c1.getEmail());
        c1.setEmail("Frank@gmail.com");

        System.out.println("Agreement: " + c1.getAgreement());
        c1.setAgreement(PowerAgreementType.POWERSUPPORT);

        System.out.println();

        c1.show();
    }
}
