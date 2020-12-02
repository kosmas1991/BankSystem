package gr.techzombie;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public String getCustomers() {
        return customers.toString();
    }
    public void newCustomer(String name) {
        System.out.println("Adding customer " + name + " to branch " + this.name + " at ??? bank " );
        customers.add(new Customer(name));
    }
    public Customer searchCustomer (String name) {
        for (Customer i:customers)
            if (i.getName().equals(name))
                return i;
        return null;
    }
}
