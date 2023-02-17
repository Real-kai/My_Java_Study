package homework;

/**
 * @author 王凯
 * @version 1.0
 */
public class BankAccount {
    private String name;
    private double balance;
    public BankAccount(String name,double initialBalance){
        this.balance = initialBalance;
        this.name = name;
    }

    public void deposit(double amount){
        balance+=amount;

    }

    public void withdraw(double amount){
        balance-=amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printBalance(){
        System.out.println(name+"的银行卡余额: "+balance+"美元");
    }
}
