package code;

import java.util.ArrayList;

public class Person {
    public double totalDebt;
    public String name;
    public ArrayList<Money> charges = new ArrayList<>();

    public Person(double totalDebt , String name) {
        this.totalDebt = totalDebt;
        this.name = name;
    }

    public void addCharge(Money charge) {
        this.charges.add(charge);
    }

    public void removeCharge(Money charge) {
        if (this.charges.isEmpty()) {
            System.out.println("List of charges is empty");
        }
        this.charges.remove(charge);
    }

    public double getTotalDebt() {
        double total = 0.0;
        if (!charges.isEmpty()) {
            for (int i = 0; i < charges.size() ; i++) {
                total += charges.get(i).getAmount();
            }
        }
        this.totalDebt = total;
        return totalDebt;
    }

    public ArrayList<Money> getCharges() {
        return charges;
    }

    public void setCharges(ArrayList<Money> charges) {
        this.charges = charges;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
