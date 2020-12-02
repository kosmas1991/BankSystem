package gr.techzombie;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
    }

    public String getName() {
        return name;
    }

    public String getTransactions() {
        return transactions.toString();
    }
    public void newTransaction (double transaction) {
        System.out.println("Adding transaction " + transaction + "€ to customer " + this.name + " at branch " + super.getClass().getName() + " at bank " + super.getClass().getName().getClass().getName() );
        transactions.add(transaction);
    }
}
