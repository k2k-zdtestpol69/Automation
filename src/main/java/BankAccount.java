public class BankAccount {
    private int money;
    private int accountBalance() {return 0;}

    private int accountBalance(int money){
        this.money = money;
        return accountBalance(money);
    }

    public boolean withdraw (int amount) {
        if (amount > accountBalance()) {
            return false;
        }
        else {
            money -= amount;
            return true;
        }
    }

    public void transfer(int amount) {
        money += amount;
    }

    public int getAccountBalance() {
        return accountBalance();
    }

}
