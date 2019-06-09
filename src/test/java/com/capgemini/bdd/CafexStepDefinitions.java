package com.capgemini.bdd;

import com.capgemini.cafex.service.Bill;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CafexStepDefinitions {

    private Bill bill;

    // COLA

    @When("^I buy \"([^\"]*)\"$")
    public void iBuy(String cola) {
        bill = new Bill(new String[]{cola});
    }

    @Then("^As a result of buying cola the bill should be \"([^\"]*)\"$")
    public void asAResultOfBuyingColaTheBillShouldBe(String expectedResult) {
        assertThat(bill.getFormattedBillForDisplay()).isEqualTo(expectedResult);
    }

    // COLA & COFFEE

    @When("^I buy \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iBuyAnd(String cola, String coffee) {
        bill = new Bill(new String[]{cola, coffee});
    }

    @Then("^As a result of buying cola and coffee the bill should be \"([^\"]*)\"$")
    public void asAResultOfBuyingColaAndCoffeeTheBillShouldBe(String expectedResult) {
        assertThat(bill.getFormattedBillForDisplay()).isEqualTo(expectedResult);
    }

    // COLA, COFFEE & CHEESE SANDWICH

    @When("^I buy \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iBuyAnd(String cola, String coffee, String cheeseSandwich) {
        bill = new Bill(new String[]{cola, coffee, cheeseSandwich});
    }

    @Then("^As a result of buying cola, coffee and cheese sandwich the bill should be \"([^\"]*)\"$")
    public void asAResultOfBuyingColaCoffeeAndCheeseSandwichTheBillShouldBe(String expectedResult) {
        assertThat(bill.getFormattedBillForDisplay()).isEqualTo(expectedResult);
    }

    // COLA, COFFEE, CHEESE SANDWICH & STEAK SANDWICH

    @When("^I buy \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iBuyAnd(String cola, String coffee, String cheeseSandwich, String steakSandwich) {
        bill = new Bill(new String[]{cola, coffee, cheeseSandwich, steakSandwich});
    }

    @Then("^As a result of buying cola, coffee, cheese sandwich and steak sandwich the bill should be \"([^\"]*)\"$")
    public void asAResultOfBuyingColaCoffeeCheeseSandwichAndSteakSandwichTheBillShouldBe(String expectedResult) {
        assertThat(bill.getFormattedBillForDisplay()).isEqualTo(expectedResult);
    }
}
