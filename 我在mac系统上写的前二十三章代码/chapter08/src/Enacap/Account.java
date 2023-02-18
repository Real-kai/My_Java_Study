package Enacap;

/**
 * @author 王凯
 * @version 1.0
 */
public class Account {
    private String name;
    private int balance;
    private String password;

    public Account() {
    }

    public Account(String name, int balance, String password) {
        setName(name);
        setBalance(balance);
        setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length()>=2&&name.length()<=4)
        {this.name = name;}
        else{
            System.out.println("名字必须是2-4个字，请重新设置并给一个默认值");
            this.name = "张三";
        }
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (balance>20){
        this.balance = balance;}
        else{
            System.out.println("余额必须大于20，请重新设置并设置一个默认值");
            this.balance=50;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length()==6){
        this.password = password;}
        else{
            System.out.println("密码必须为六位，请重新设置，给你一个默认值");
            this.password="111111";
        }
    }
    public void inf(){
        System.out.println("姓名："+name+"， 余额："+balance+"， 密码："+password);
    }
}
class AccountTest{
    public static void main(String[] args) {
        Account ac = new Account("王凯",1000000,"wkwano");
        ac.inf();
    }

}
