package code;

import java.util.ArrayList;

public class Person {
    public double totalDebt;
    public String name;
    public ArrayList<Money> charge = new ArrayList<>();

    public Person(double totalDebt , String name) {
        this.totalDebt = totalDebt;
        this.name = name;
    }

    public void addCharge(Money charge) {
        this.charge.add(charge);
    }

    public void removeCharge(Money charge) {
        this.charge.remove(charge);
    }

    public double getTotalDebt() {
        return totalDebt;
    }

    public void setTotalDebt() {
        double total = 0.0;
        if (!charge.isEmpty()) {
            for (int i = 0 ; i < charge.size() ; i++) {
                total += charge.get(i).getAmount();
            }
        }
        this.totalDebt = total;
    }

    public ArrayList<Money> getCharge() {
        return charge;
    }

    public void setCharge(ArrayList<Money> charge) {
        this.charge = charge;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
