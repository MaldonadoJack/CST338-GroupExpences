import java.util.ArrayList;

public class Person {
    public double totalDebt;
    public ArrayList<Money> charge = new ArrayList<>();

    public Person(double totalDebt) {
        this.totalDebt = totalDebt;
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

    public void setTotalDebt(double totalDebt) {
        this.totalDebt = totalDebt;
    }

    public ArrayList<Money> getCharge() {
        return charge;
    }

    public void setCharge(ArrayList<Money> charge) {
        this.charge = charge;
    }
}
