package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 27/12/2018.
 */
public class BankAccount extends Account implements Transactable {
    Double balance;

    public BankAccount(){
        this.balance = 0.0;
    }

    public void setBalance(Double val) {
        this.balance = val;
    }

    public void deposit(Double amountToIncreaseBy) {
        if (amountToIncreaseBy < 0){
            throw new IllegalArgumentException();
        }
        else {
            this.balance = this.balance + amountToIncreaseBy;
        }
    }

    public void withdrawal(Double amountToDecreaseBy){
        if (amountToDecreaseBy < 0){
            throw new IllegalArgumentException();
        }
        else if (this.balance - amountToDecreaseBy < 0) {
            throw new IllegalArgumentException();
        }
        else {
            this.balance -= amountToDecreaseBy;
        }
    }

    public Double getBalance() {
        return this.balance;
    }
}
