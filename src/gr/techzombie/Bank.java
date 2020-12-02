package gr.techzombie;

import java.util.ArrayList;

public class Bank {
    private final String name;
    private final ArrayList<Branch> branches;

    public Bank(String name) {
        System.out.println("Adding bank " + name);
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public void newBranch(String name) {
        System.out.println("Adding branch " + name + " at " + this.name + " bank ");
        branches.add(new Branch(name,this.name));
    }

    public Branch searchBranch(String name) {
        for (Branch i : branches)
            if (i.getName().equals(name))
                return i;
        return null;
    }

}

