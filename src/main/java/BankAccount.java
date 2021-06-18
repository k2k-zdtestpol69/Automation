public class BankAccount {
    private int accountBalance;
    private BankAccount() {
        accountBalance = 0;
    }
    private BankAccount(int accountBalance){
        this.accountBalance = accountBalance;
    }
    public boolean withdraw (int amount) {
        if (amount > accountBalance) {
            return false;
        }
        else {
            accountBalance -= amount;
            return true;
        }
    }
    public void transfer(int amount) {
        accountBalance += amount;
    }
    public int getAccountBalance() {
        return accountBalance;
    }
}