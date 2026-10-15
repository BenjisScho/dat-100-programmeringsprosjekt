package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;
import no.hvl.dat100.javel.oppgave2.MonthPowerData;

public class InvoiceMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 5");
        System.out.println("==============");
        System.out.println();

        Customer c2 = new Customer("Fred", "fred@gmail.com", 1002, PowerAgreementType.POWERSUPPORT);
        Customer c3 = new Customer("Pedro", "pedre@gmail.com", 1003, PowerAgreementType.NORGESPRICE);

        Invoice i1 = new Invoice(c2,"May", CustomerPowerUsageData.usage_month_customer1, MonthPowerData.powerprices_month);
        Invoice i2 = new Invoice(c3, "November", CustomerPowerUsageData.usage_month_customer2, MonthPowerData.powerprices_month);

        Invoice[] iList = {i1, i2};
       // i1.computeAmount();

        //i1.printInvoice();

        Invoices.processInvoices(iList);



    }
}
