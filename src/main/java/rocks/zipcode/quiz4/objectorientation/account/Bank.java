package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {
    private List<Account> accountList;

    public Bank(){
        accountList = new ArrayList<>();
    }

    public void removeBankAccountByIndex(Integer indexNumber) {
        accountList.remove(accountList.get(indexNumber));
    }

    public void addBankAccount(BankAccount bankAccount) {
        accountList.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        return accountList.contains(bankAccount);
    }
}
