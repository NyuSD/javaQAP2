package CreditCard;

public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;

    public CreditCard(Person newCardHolder, Money limit) {
        this.owner       = newCardHolder;
        this.creditLimit = new Money(limit); 
        this.balance     = new Money(0);
    }

    public Money getBalance() {
        return new Money(balance);
    }

    public Money getCreditLimit() {
        return new Money(creditLimit);
    }

    public String getPersonals() {
        return owner.toString();
    }

    public void charge(Money amount) {
        Money newBalance = balance.add(amount);
        if (newBalance.compareTo(creditLimit) <= 0) {
            balance = newBalance;
        } else {
            System.out.println("Error: Charge would exceed credit limit.");
        }
    }

    public void payment(Money amount) {
        balance = balance.subtract(amount);
    }
}
