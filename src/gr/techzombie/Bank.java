package gr.techzombie;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        System.out.println("Adding bank " + name);
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public String getName() {
        return name;
    }

    public String getBranches() {
        return branches.toString();
    }
    public void newBranch(String name) {
        System.out.println("Adding branch " + name + " at " + this.name +  " bank ");
        branches.add(new Branch(name));
    }
    public int getBranchInt(String name) {
        return branches.indexOf(name);   ///////////////////
    }
    public Branch getBranch(int i) {
        return branches.get(i);
    }
    public Branch searchBranch (String name) {
        for (Branch i:branches)
            if (i.getName().equals(name))
                return i;
        return null;
    }

}

