package no.hvl.dat100.javel.oppgave1;

import no.hvl.dat100.javel.oppgave2.MonthlyPower;

public class DayMain {

    public static void main(String[] args) {

        // test data
        double[] powerusage_day = DayPowerData.powerusage_day;

        double[] powerprices_day = DayPowerData.powerprices_day;

        System.out.println("==============");
        System.out.println("OPPGAVE 1");
        System.out.println("==============");
        System.out.println();

        System.out.println("A)");
        DailyPower.printPowerPrices(powerprices_day);

        System.out.println();

        System.out.println("B)");
        DailyPower.printPowerUsage(powerusage_day);

        System.out.println();

        System.out.println("C)");
        double total = DailyPower.computePowerUsage(powerusage_day);
        System.out.println(total);

        System.out.println();

        System.out.println("D)");
        double spotpris = DailyPower.computeSpotPrice(powerusage_day, powerprices_day);
        System.out.println("SpotPris: " + spotpris);

        System.out.println();

        System.out.println("F)");
        double support = DailyPower.computePowerSupport(powerusage_day, powerprices_day);
        System.out.println("Strømstøtte: " + support);

        System.out.println();

        System.out.println("G)");
        double price = DailyPower.computeNorgesPrice(powerusage_day);
        System.out.println("Norgespris: " + price);

        System.out.println();

        System.out.println("H)");
        double peak = DailyPower.findPeakUsage(powerusage_day);
        System.out.println("Høyeste forbruk: " + peak);

        System.out.println();

        System.out.println("I)");
        double average = DailyPower.findAvgPower(powerusage_day);
        System.out.println("Gjennomsbittlig forbruk: " + average);

    }
}
