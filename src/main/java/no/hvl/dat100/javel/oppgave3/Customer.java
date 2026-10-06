package no.hvl.dat100.javel.oppgave3;

public class Customer {

    String name;
    String email;
    int customer_id;
    PowerAgreementType agreement;

    public Customer(String name, String email, int customer_id, PowerAgreementType agreement) {

        this.name = name;
        this.email = email;
        this.customer_id = customer_id;
        this.agreement = agreement;
    }


    public String getName(){
        return name;
    }
    public void setName(String newName){
        name = newName;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String newEmail){
        email = newEmail;
    }

    public int getCustomer_id(){
        return customer_id;
    }
    public void setCustomer_id(int newId){
        customer_id = newId;
    }

    public PowerAgreementType getAgreement(){
        return agreement;
    }
    public void setAgreement(PowerAgreementType newAgreement){
        agreement = newAgreement;
    }
    // TODO - toString method

    public void show(){
        System.out.println("Customer number: " + customer_id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Agreement: " + agreement);
    }

}
