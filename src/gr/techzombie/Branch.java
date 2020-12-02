package gr.techzombie;

import java.util.ArrayList;

public class Branch{
    private final String name;
    private final ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void newCustomer(String name) {
        System.out.println("Adding customer " + name + " to branch " + this.name );
        customers.add(new Customer(name));
    }
    public Customer searchCustomer (String name) {
        for (Customer i:customers)
            if (i.getName().equals(name))
                return i;
        return null;
    }
}
