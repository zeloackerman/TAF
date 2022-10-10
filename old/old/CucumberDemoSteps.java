package old;



import com.digitalnomads.Bank;
import com.digitalnomads.DemirBank;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class CucumberDemoSteps {

    DemirBank atayDemirAccount;
    DemirBank nuraziz;
    DemirBank aibek;
    {
        try {
            atayDemirAccount = new DemirBank(111111111111L, 555555555L);
            nuraziz = new DemirBank(555555555555L, 777777777L);
            aibek = new DemirBank(666666666666L, 999999999L);
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }




   // FIRST
    @Given("User is logged in to Demir account")
    public void user_is_logged_in_to_demir_account() {
        System.out.println("User is logged in ");

    }
    @When("User deposit ${int} to Atay")
    public void user_deposit_$_to_atay(Integer amount) throws Exception {
        atayDemirAccount.deposit(amount);
    }
    @Then("Atay should have ${int} in balance")
    public void atay_should_have_$_in_balance(Integer expectedBalance) {
        Double x = Double.valueOf(expectedBalance);
        Assertions.assertEquals(x, atayDemirAccount.getBalance());

    }

    //SECOND
    @Given("User is logged in to Demir account a")
    public void user_is_logged_in_to_demir_account_a() {
        System.out.println("User is logged into his account   ");
    }

    @When("User deposit &{int} to Nuraziz")
    public void user_deposit_to_nuraziz(Integer amount) throws Exception {
        nuraziz.deposit(amount);
    }

    @Then("Nuraziz should not have {int} in balance")
    public void nuraziz_should_not_have_in_balance(Integer balance) {
        Assertions.assertNotEquals(Double.valueOf(balance),nuraziz.getBalance());


    }

    //THIRD
    @Given("User is logged in to chase account")
    public void user_is_logged_in_to_chase_account() {
        System.out.println("User is logged in to account");
    }
    @Given("User has {int} in the account")
    public void user_has_in_the_account(Integer balanceAmount) throws Exception {
        aibek.deposit(balanceAmount);
    }
    @When("User deposits {int} to John Doe")
    public void user_deposits_to_john_doe(Integer balanceAmount) throws Exception {
        Bank.transferFunds(aibek, nuraziz, balanceAmount);
    }
    @Then("User should have {int}")
    public void user_should_have(Integer balanceAmount) {
        Assertions.assertEquals(Double.valueOf(balanceAmount), aibek.getBalance());
    }
    @Then("John Doe Should not any deposits")
    public void john_doe_should_not_any_deposits() {
        System.out.println(aibek.getBalance());
    }




}
