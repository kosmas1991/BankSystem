package gr.techzombie;

import java.util.ArrayList;

public class Branch {
    private final String name;
    private final String bankName;
    private final ArrayList<Customer> customers;

    public Branch(String name,String bankName) {
        this.name = name;
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void newCustomer(String name) {
        System.out.println("Adding customer " + name + " to branch " + this.name + " to bank " + bankName);
        customers.add(new Customer(name,this.name,this.bankName));
    }

    public Customer searchCustomer(String name) {
        for (Customer i : customers)
            if (i.getName().equals(name))
                return i;
        return null;
    }
}
