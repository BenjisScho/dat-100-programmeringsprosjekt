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
        Customer c3 = new Customer("Pedro", "pedro@gmail.com", 1003, PowerAgreementType.NORGESPRICE);
        Customer c4 = new Customer("Carl", "carl@gmail.com", 1004, PowerAgreementType.SPOTPRICE);

        Invoice i1 = new Invoice(c2,"May", CustomerPowerUsageData.usage_month_customer1, MonthPowerData.powerprices_month);
        Invoice i2 = new Invoice(c3, "November", CustomerPowerUsageData.usage_month_customer2, MonthPowerData.powerprices_month);
        Invoice i3 = new Invoice(c4, "June", CustomerPowerUsageData.usage_month_customer3, MonthPowerData.powerprices_month);

        Invoice[] iList = {i1, i2, i3};

        i1.computeAmount();

        System.out.println();
        System.out.println();

        i1.printInvoice();

        System.out.println();
        System.out.println();

        Invoices.processInvoices(iList);



    }
}
