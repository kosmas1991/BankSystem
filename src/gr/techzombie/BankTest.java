package gr.techzombie;

public class BankTest {
    public static void main(String[] args) {
        // test some functionality
        Bank ethnikiBank = new Bank("Ethniki");
        ethnikiBank.newBranch("Kozanis");
        Branch kozanis = ethnikiBank.searchBranch("Kozanis");
        kozanis.newCustomer("Kosmas");
        Customer kosmas = kozanis.searchCustomer("Kosmas");
        kosmas.newTransaction(2.00);
        kosmas.newTransaction(-1.34);
        System.out.println("To ypoloipo gia ton " + kosmas.getName() + " einai " + kosmas.sum() + " €");
        Bank piraeus = new Bank("Piraeus");
        piraeus.newBranch("Ypokatastima Kozanis");
        Branch piraeusKozani = piraeus.searchBranch("Ypokatastima Kozanis");
        piraeusKozani.newCustomer("Litsa");
        Customer litsa = piraeusKozani.searchCustomer("Litsa");
        litsa.newTransaction(50.34);
        litsa.newTransaction(-23.55);
        System.out.println("To ypoloipo gia ton " + litsa.getName() + " einai " + litsa.sum() + " €");
        kozanis.newCustomer("John");
        Customer john = kozanis.searchCustomer("John");
        john.newTransaction(129);
        john.newTransaction(-40.98);
        System.out.println("To ypoloipo tou john "  + john.sum());
    }
}
