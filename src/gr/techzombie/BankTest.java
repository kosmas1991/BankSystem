package gr.techzombie;

import java.util.ArrayList;
import java.util.Scanner;

public class BankTest {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        Master master = new Master("master");
        boolean stop = false;
        printInfo();
        while (!stop) {
           int choice = input.nextInt();
           input.nextLine();
           if (choice<1 || choice>10) {
               System.out.println("Give a valid option");
               printInfo();
               choice = input.nextInt();
               input.nextLine();
           }
           ArrayList<String> test;
           switch (choice){
               case 1:
                   String bankName;
                   try {
                       System.out.println("Give bank's name:");
                       bankName = input.nextLine();
                       master.addNewBank(bankName);
                       printInfo();
                   } catch (Exception e) {
                       e.printStackTrace();
                       printInfo();
                   }
                   break;
               case 2:
                   int counter;
                   try {
                       System.out.println("Available banks:");
                       test= master.getBanksNames();
                       counter = 1;
                       for (String i : test)
                           System.out.println(counter + ". " + i);
                       printInfo();
                   } catch (Exception e) {
                       e.printStackTrace();
                       printInfo();
                   }
                   break;
               case 3:
                   String branchName;
                   try {
                       System.out.println("Give Bank's name:");
                       bankName = input.nextLine();
                       System.out.println("Give Branch's name:");
                       branchName = input.nextLine();
                       master.searchBank(bankName).newBranch(branchName);
                       printInfo();
                   } catch (Exception e) {
                       e.printStackTrace();
                       printInfo();
                   }
                   break;
               case 4:
                   try {
                       System.out.println("Give Bank's name:");
                       bankName = input.nextLine();
                       //test=null;
                       test=master.searchBank(bankName).getBranchesNames();
                       counter = 1;
                       for (String i : test)
                           System.out.println(counter + ". " + i);
                       printInfo();
                   } catch (Exception e) {
                       e.printStackTrace();
                       printInfo();
                   }
                   break;
               case 5:
                   try {
                       System.out.println("Give bank's name:");
                       bankName = input.nextLine();
                       System.out.println("Give Branch's name:");
                       branchName = input.nextLine();
                       System.out.println("Give Customer's name:");
                       String customer = input.nextLine();
                       master.searchBank(bankName).searchBranch(branchName).newCustomer(customer);
                       printInfo();
                   } catch (Exception e) {
                       e.printStackTrace();
                       printInfo();
                   }
                   break;
               case 6:
                   try {
                       System.out.println("Give Bank's name:");
                       bankName = input.nextLine();
                       System.out.println("Give Branch's name:");
                       branchName = input.nextLine();
                       test=master.searchBank(bankName).searchBranch(branchName).getCustomersNames();
                       counter = 1;
                       for (String i : test)
                           System.out.println(counter + ". " + i);
                       printInfo();
                   } catch (Exception e) {
                       e.printStackTrace();
                       printInfo();
                   }
                   break;
               case 7:
                   String customerName;
                   try {
                       System.out.println("Give Bank's name:");
                       bankName = input.nextLine();
                       System.out.println("Give Branch's name:");
                       branchName = input.nextLine();
                       System.out.println("Give Customer's name:");
                       customerName = input.nextLine();
                       System.out.println("Give transaction's amount:");
                       double amount = Double.parseDouble(input.nextLine());
                       master.searchBank(bankName).searchBranch(branchName).searchCustomer(customerName).newTransaction(amount);
                       printInfo();
                   } catch (NumberFormatException e) {
                       e.printStackTrace();
                       printInfo();
                   }
                   break;
               case 8:
                   try {
                       System.out.println("Give Bank's name:");
                       bankName = input.nextLine();
                       System.out.println("Give Branch's name:");
                       branchName = input.nextLine();
                       System.out.println("Give Customer's name:");
                       customerName = input.nextLine();
                       System.out.println(master.searchBank(bankName).searchBranch(branchName).searchCustomer(customerName).sum());
                       printInfo();
                   } catch (Exception e) {
                       e.printStackTrace();
                       printInfo();
                   }
                   break;
               case 9:
                   printInfo();
                   break;
               case 10:
                   stop=true;
                   break;
               }

           }

        }

    private static void printInfo() {
        System.out.println("Enter your choice:");
        System.out.println("1. Add new Bank");
        System.out.println("2. Get available Banks");
        System.out.println("3. Add new Branch");
        System.out.println("4. Get Bank's available Branches");
        System.out.println("5. Add new Customer");
        System.out.println("6. Get Branch's available Customers");
        System.out.println("7. Add a transaction");
        System.out.println("8. Get Customer's summary in €");
        System.out.println("9. Print info");
        System.out.println("10. exit");
    }

}
