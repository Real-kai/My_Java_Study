package homework;

import homework.BankAccount;

/**
 * @author 王凯
 * @version 1.0
 */
public class CheckingAccount extends BankAccount {
    public CheckingAccount(String name,double initialBalance) {
        super(name,initialBalance);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount-1);
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount+1);
    }
}

