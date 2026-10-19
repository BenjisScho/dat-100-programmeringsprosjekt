package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;

public class Customers {

    private Customer[] customers;

    // a) Complete constructor
    public Customers(int size) {
        customers = new Customer[size];
    }

    // b) count number of non-null references
    public int countNonNull() {

        int count = 0;

        // loop through customers, ignoring every null-based item
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != null) {
                count++;
            }
        }

        return count;
    }

    // c) return reference to customer with given id (if exists)
    public Customer getCustomer(int customer_id) {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != null && customers[i].getCustomer_id() == customer_id) {
                return customers[i];
            }
        }
        return null;
    }

    // d) add a customer to the reference table
    public boolean addCustomer(Customer c) {
        boolean inserted = false;

        for (int i = 0; i < customers.length; i++) {
            if (customers[i] == null) {
                customers[i] = c;
                inserted = true;
                break;
            }
        }

        return inserted;
    }

    // e) remove customer with given id from reference table
    public Customer removeCustomer(int customer_id) {

        Customer c = null;

        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != null && customers[i].getCustomer_id() == customer_id) {
                c = customers[i];
                customers[i] = null;
                break;
            }
        }

        return c;
    }

    // f) return reference table with all customers
    public Customer[] getCustomers() {
        Customer[] cs = new Customer[customers.length];

        int count = 0;

        // loop through customers, ignoring every null-based item
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != null) {
                cs[count] = customers[i];
                count++;
            }
        }

        return java.util.Arrays.copyOf(cs, count);
    }
}