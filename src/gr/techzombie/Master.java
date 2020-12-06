package gr.techzombie;

import java.util.ArrayList;

public class Master {
    protected final String name;
    private final ArrayList<Bank> banks;

    public ArrayList<String> getBanksNames() {
        ArrayList<String> onomata = new ArrayList<>();
        for (Bank i : banks)
            onomata.add(i.getName());
        return onomata;
    }

    public Master(String name) {
        this.name = name;
        this.banks = new ArrayList<>();
    }

    public void addNewBank(String name){
        banks.add(new Bank(name));

    }

    public Bank searchBank(String name){
        for (Bank i : banks)
            if (i.getName().equals(name))
                return i;
        return null;
    }
}
