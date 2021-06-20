package automation.steps;

import automation.BankAccount;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class BankAccountSteps {

    private BankAccount bankAccount;
    private boolean IsWithdrawPossible;

    @Given("that BankAccount has {int} PLN")
    public void thatBankAccountHasPLN(int accountBalance) {
        bankAccount = new BankAccount(accountBalance);

    }

    @When("the user withdraws {int} PLN")
    public void theUserWithdrawsPLN(int withdrawMoney) {
        IsWithdrawPossible = bankAccount.withdraw(withdrawMoney);


    }

    @Then("the transaction should be processed")
    public void theTransactionShouldBeProcessed() {
        Assert.assertTrue(IsWithdrawPossible);
        
    }

    @And("AccountBalance should be {int} PLN")
    public void accountbalanceShouldBePLN(int accountBalance) {
        Assert.assertEquals(accountBalance, bankAccount.getAccountBalance());
    }

    @Then("the transaction should not be processed")
    public void theTransactionShouldNotBeProcessed() {
        Assert.assertFalse(IsWithdrawPossible);
    }

    @And("the user transfer {int} PLN")
    public void theUserTransferPLN(int transferMoney) {
        bankAccount.transfer(transferMoney);
    }
}
