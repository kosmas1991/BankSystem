package gr.techzombie;

public class BankTest {
    public static void main(String[] args) {
        Bank ethnikiBank = new Bank("Ethniki");
        ethnikiBank.newBranch("Kozanis");
        Branch kozanis = ethnikiBank.searchBranch("Kozanis");
        kozanis.newCustomer("Kosmas");
        Customer kosmas = kozanis.searchCustomer("Kosmas");
        kosmas.newTransaction(2.00);


    }
}
