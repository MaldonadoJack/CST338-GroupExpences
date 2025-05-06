public class Money {
    public static final Money ONE_DOLLAR = new Money(1.0);
    private final long amount;

    public Money(double amount) {
        this.amount =Math.round(amount * 100);
    }

    public String getAmountString() {
        return String.format("%.2f", getAmount());
    }

    public double getAmount() {
        return this.amount / 100.0;
    }

    public Money add(Money add) {
        return new Money(this.getAmount() + add.getAmount());
    }

    public Money subtract(Money subtract) {
        return new Money(this.getAmount() - subtract.getAmount());
    }

    public String toString() {
        return "$" + getAmountString();
    }
}
