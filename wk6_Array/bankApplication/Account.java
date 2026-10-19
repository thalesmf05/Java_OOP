public class Account {
    private String name, accountNum;
    private double balance;

    public Account(String name, String accountName, double balance) {
        this.name = name;
        this.accountNum = accountName;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                "\nAccount Name: " + accountNum +
                "\nBalance: " + balance;
    }
}
