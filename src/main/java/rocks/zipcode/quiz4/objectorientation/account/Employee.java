package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker, Transactable {
    BankAccount bankAccount;
    Double hoursWorked = 0.0;
    Double hourlyWage = 35.0;
    Double moneyEarned;


    public Employee() {
        this.bankAccount = new BankAccount();
    }

    public Employee(BankAccount bankAccount) {
        this.bankAccount= bankAccount;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void increaseHoursWorked(Double numberOfHours) {
        hoursWorked += numberOfHours;
    }

    public Double getHoursWorked() {
        return hoursWorked;
    }

    public Double getHourlyWage() {
        return hourlyWage;
    }

    public Double getMoneyEarned() {
        return moneyEarned;
    }

    public void deposit(Double amountToIncreaseBy) {
        bankAccount.deposit(amountToIncreaseBy);
    }

    public void withdrawal(Double amountToDecreaseBy) {
        bankAccount.withdrawal(amountToDecreaseBy);
    }

    public Double getBalance() {
        return bankAccount.balance;
    }
}
