package gr.techzombie;

import java.util.ArrayList;

public class Customer {
    private final String name;
    private final ArrayList<Double> transactions;

    public Customer(String name) {
        this.name = name;
        this.transactions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void newTransaction (double transaction) {
        System.out.println("Adding transaction " + transaction + "€ to customer " + this.name );
        transactions.add(transaction);
    }
    public String sum () {
        double summary = 0.0;
        for (int i=0 ; i< transactions.size() ; i++)
            summary = summary + returnDoubleTransaction(i);
            return String.format("%.2f", summary);

    }

    private double returnDoubleTransaction(int i) {
        return transactions.get(i);

    }
}
