package gr.techzombie;

import java.io.Serializable;
import java.util.ArrayList;

public class Customer implements Serializable {
    private final String name;
    private final String branchName;
    private final String bankName;
    private final ArrayList<Double> transactions;

    public Customer(String name,String branchName,String bankName) {
        this.name = name;
        this.branchName = branchName;
        this.bankName = bankName;
        this.transactions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void newTransaction(double transaction) {
        System.out.println("Adding transaction " + transaction + "€ to customer " + this.name + " to branch " + branchName + " to bank " + bankName);
        transactions.add(transaction);
    }

    public String sum() {
        double summary = 0.0;
        for (int i = 0; i < transactions.size(); i++)
            summary = summary + returnDoubleTransaction(i);
        return String.format("%.2f €", summary);

    }

//    public String getTransactions() {
//        return transactions.toString();
//    }

    private double returnDoubleTransaction(int i) {
        return transactions.get(i);

    }
}
