package CreditCard;

public class Money {
    private long dollars;
    private long cents;

    public Money(double amount) {
        long totalCents = Math.round(amount * 100);
        this.dollars = totalCents / 100;
        this.cents   = totalCents % 100;
    }

    public Money(Money other) {
        this.dollars = other.dollars;
        this.cents   = other.cents;
    }

    public Money(long dollars, long cents) {
        this.dollars = dollars;
        this.cents   = cents;
    }

    public Money add(Money otherAmount) {
        long thisTotal  = this.dollars * 100 + this.cents;
        long otherTotal = otherAmount.dollars * 100 + otherAmount.cents;
        long sum        = thisTotal + otherTotal;
        return new Money(sum / 100, sum % 100);
    }

    public Money subtract(Money otherAmount) {
        long thisTotal  = this.dollars * 100 + this.cents;
        long otherTotal = otherAmount.dollars * 100 + otherAmount.cents;
        long diff       = thisTotal - otherTotal;
        return new Money(diff / 100, diff % 100);
    }

    // Returns negative if this < other, 0 if equal, positive if this > other
    public int compareTo(Money other) {
        long thisTotal  = this.dollars * 100 + this.cents;
        long otherTotal = other.dollars * 100 + other.cents;
        return Long.compare(thisTotal, otherTotal);
    }

    public boolean equals(Money other) {
        return (this.dollars == other.dollars && this.cents == other.cents);
    }

    public String toString() {
        return String.format("$%d.%02d", dollars, cents);
    }
}
