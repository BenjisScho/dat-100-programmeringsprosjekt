package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave2.MonthlyPower;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

import java.util.Arrays;
import java.math.*;

public class Invoice {

    private Customer c; // customer associated with this invoice
    private String month; // month that the invoice covers
    private double[][] usage; // power usage this month (per day and per hour)
    private double[][] prices; // power prices for this month

    private double amount; // power price for this month


    public Invoice(Customer c, String month, double[][] usage, double[][] prices) {

        this.c = c;
        this.month = month;
        this.usage = usage;
        this.prices = prices;
        amount = 0;

    }

    public void computeAmount() {

        amount = 0;

        switch (c.getAgreement()){
            case SPOTPRICE:
                for (int i = 0; i < usage.length; i++){

                    for (int p = 0; p < usage[i].length; p++){
                        amount += usage[i][p] * prices[i][p];
                    }
                }
            break;

            case NORGESPRICE:
                for (int i = 0; i < usage.length; i++){

                    for (int p = 0; p < usage[i].length; p++){
                        amount += usage[i][p] * 0.50;
                    }
                }
            break;

            case POWERSUPPORT:
                for (int i = 0; i < usage.length; i++){

                    for (int p = 0; p < usage[i].length; p++){
                        if (usage[i][p] > 0.9625){
                            double midPrice = prices[i][p] - 0.9625;
                            amount += prices[i][p] - (midPrice * 90) / 100;
                        }else{
                            amount += usage[i][p] * prices[i][p];
                        }
                    }
                }
            break;

        }

        amount = Math.round(amount * 100.0) / 100.0;
        System.out.println("Amount: " + amount + "kr");
    }

    public void printInvoice() {

        c.show();
        System.out.println();
        System.out.println("Month: " + month);
        MonthlyPower.computePowerUsage(usage);
        computeAmount();

    }
}
