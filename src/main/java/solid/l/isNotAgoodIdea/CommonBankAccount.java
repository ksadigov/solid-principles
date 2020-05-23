package solid.l.isNotAgoodIdea;

/**
 * CommonBankAccount represents any bank account within our simplified context.
 * It has the methods deposit(), getBalance(), cashOut(), and income().
 */
public class CommonBankAccount {
    protected double balance;

    public CommonBankAccount() {
        this.balance = 0;
    }

    public void deposit(double value) {
        this.balance += value;
    }

    public void cashOut(double value) {
        if (value <= this.balance) {
            this.balance -= value;
        } else {
            throw new IllegalArgumentException("Insufficient balance.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void income() throws Exception {
        this.balance *= 0.02;
    }
}
