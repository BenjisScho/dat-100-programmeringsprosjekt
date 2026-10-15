package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DayPowerData;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MonthMain {
    public static void main(String[] args) {

        // test data
        double[][] power_prices_month = MonthPowerData.powerprices_month;

        double[][] power_usage_month = MonthPowerData.powerusage_month;

        System.out.println("==============");
        System.out.println("OPPGAVE 2");
        System.out.println("==============");
        System.out.println();

        System.out.println("A)");
        MonthlyPower.print_PowerUsage(power_usage_month);

        System.out.println();

        System.out.println("B)");
        MonthlyPower.print_PowerPrices(power_prices_month);

        System.out.println();

        System.out.println("C)");
        double totalMonth = MonthlyPower.computePowerUsage(power_usage_month);
        System.out.println("Total strømforbruk for månden: " + totalMonth + " kwh");

        System.out.println();

        System.out.println("D)");
        boolean hytte = MonthlyPower.exceedThreshold(power_usage_month, 1000);
        boolean bolig = MonthlyPower.exceedThreshold(power_usage_month, 5000);
        System.out.println("Over hyttegrensen: " + hytte);
        System.out.println("Over boliggrensen: " + bolig);

        System.out.println();

        System.out.println("E)");
        double spotprisMonth = MonthlyPower.computeSpotPrice(power_usage_month, power_prices_month);
        System.out.println("Spotpris for måneden: " + spotprisMonth);

        System.out.println();

        System.out.println("F)");
        double support = MonthlyPower.computePowerSupport(power_usage_month, power_prices_month);
        System.out.println("Strømstøtte for måneden: " + support);

        System.out.println();

        System.out.println("G)");
        double norgespris = MonthlyPower.computeNorgesPrice(power_usage_month);
        System.out.println("Norgespris for måneden: " + norgespris);






    }
}