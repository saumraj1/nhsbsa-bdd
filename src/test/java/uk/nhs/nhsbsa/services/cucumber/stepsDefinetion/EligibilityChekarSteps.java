package uk.nhs.nhsbsa.services.cucumber.stepsDefinetion;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.nhs.nhsbsa.services.pages.*;

/**
 * By Laxmi
 **/
public class EligibilityChekarSteps {
    @When("^I click on accept cookies$")
    public void iClickOnAcceptCookies() {
       new StartPage().setAcceptCookies();
    }

    @And("^I click on start now button$")
    public void iClickOnStartNowButton() {
        new StartPage().setClickOnStartButton();
    }

    @And("^I select wales as my live in country$")
    public void iSelectWalesAsMyLiveInCountry() {
        new LocationPage().selectRadioWalesButton();
    }

    @And("^I click on next button$")
    public void iClickOnNextButton() {
        new LocationPage().clickOnNextButtonAfterCountry();
    }

    @And("^I select yes radio button for question is your gp practice in scotland or wales$")
    public void iSelectYesRadioButtonForQuestionIsYourGpPracticeInScotlandOrWales() {
        new GpPage().selectGpPracticeRadio();
    }

    @And("^I click on next button after selecting gp practice question$")
    public void iClickOnNextButtonAfterSelectingGpPracticeQuestion() {
        new GpPage().selectGpPracticeRadioNextbutton();
    }

    @And("^I select wales as my dental practice$")
    public void iSelectWalesAsMyDentalPractice() {
        new DentalPracticePage().selectDentalPracticeCountry();
    }

    @And("^I click on next button after dental practice question$")
    public void iClickOnNextButtonAfterDentalPracticeQuestion() {
        new DentalPracticePage().clickOnDentalPracticeNextButton();
    }

    @When("^I enter \"([^\"]*)\" birth day in birthdate field$")
    public void iEnterBirthDayInBirthdateField(String date) {
      // new DobPage().enterDayOfBirthday(date);
    }

    @And("^I enter \"([^\"]*)\" as birth month in birthdate field$")
    public void iEnterAsBirthMonthInBirthdateField(String arg0) {

    }

    @And("^I enter \"([^\"]*)\" as my birth year in birthdate field$")
    public void iEnterAsMyBirthYearInBirthdateField(String arg0) {

    }

    @And("^I click next button on radio button after birth date field$")
    public void iClickNextButtonOnRadioButtonAfterBirthDateField() {
    }

    @And("^I click on yes radio button for do you live with your partner question$")
    public void iClickOnYesRadioButtonForDoYouLiveWithYourPartnerQuestion() {
    }

    @And("^I click on next button after partner question$")
    public void iClickOnNextButtonAfterPartnerQuestion() {
    }

    @And("^I click on yes radio button for tax credit and benefits question$")
    public void iClickOnYesRadioButtonForTaxCreditAndBenefitsQuestion() {
    }

    @And("^I click on next button after tax credit question$")
    public void iClickOnNextButtonAfterTaxCreditQuestion() {
    }

    @And("^I click on yes radio button for you and your partner get paid universal credit$")
    public void iClickOnYesRadioButtonForYouAndYourPartnerGetPaidUniversalCredit() {
    }

    @And("^I click on next buttton after paid universal credit question$")
    public void iClickOnNextButttonAfterPaidUniversalCreditQuestion() {
    }

    @And("^I select yes radio button as a part of the universal credit$")
    public void iSelectYesRadioButtonAsAPartOfTheUniversalCredit() {
    }

    @And("^I click on next button after part of the universal credit question$")
    public void iClickOnNextButtonAfterPartOfTheUniversalCreditQuestion() {
    }

    @And("^I select yes radio button for getting paid £(\\d+) or less on last universal credit$")
    public void iSelectYesRadioButtonForGettingPaid£OrLessOnLastUniversalCredit(int arg0) {
    }

    @And("^I click on next button after getting paid £(\\d+)$")
    public void iClickOnNextButtonAfterGettingPaid£(int arg0) {
    }

    @Then("^I see the result$")
    public void iSeeTheResult() {
    }

    @And("^I select no radio button for do you live with your partner question$")
    public void iSelectNoRadioButtonForDoYouLiveWithYourPartnerQuestion() {
    }

    @And("^I select no radio button for tax credit and benefits question$")
    public void iSelectNoRadioButtonForTaxCreditAndBenefitsQuestion() {
    }

    @And("^I select no for injury and illness caused by serving in the armed forces$")
    public void iSelectNoForInjuryAndIllnessCausedByServingInTheArmedForces() {
    }

    @And("^I click on next button after injury and illness question$")
    public void iClickOnNextButtonAfterInjuryAndIllnessQuestion() {
    }

    @And("^I select no for do you live permanently in care home question$")
    public void iSelectNoForDoYouLivePermanentlyInCareHomeQuestion() {
    }

    @And("^I click on next button after living in care home questions$")
    public void iClickOnNextButtonAfterLivingInCareHomeQuestions() {
    }

    @And("^I select no for savings investment or property question$")
    public void iSelectNoForSavingsInvestmentOrPropertyQuestion() {
    }

    @And("^I click on next button after saving investment or property question$")
    public void iClickOnNextButtonAfterSavingInvestmentOrPropertyQuestion() {
    }

    @Then("^I see the result you get help with nhs$")
    public void iSeeTheResultYouGetHelpWithNhs() {
    }

    @Then("^I see the result you get help with nhs for under age$")
    public void iSeeTheResultYouGetHelpWithNhsForUnderAge() {
    }
}
