import core.BaseTest;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.annotations.Test;
import pages.adminarea.*;


@Test
public class GiftVoucherStepDefinitions extends BaseTest {

   @Before
    public void setup() {
        Browser.setup();
    }

    @After
    public void quit() {
        Browser.quit();
    }

    @Given("the user is on the admin page")
    public void the_user_is_on_the_admin_page() {
        AdminLogin.navigate();
        AdminLogin.login();
        //    throw new cucumber.api.PendingException();
    }

    @When("the user otiva na GiftVouchers")
    public void the_user_otiva_na_GiftVouchers() {
        SalesGiftVoucher.goToGiftVouchers();

        // throw new cucumber.api.PendingException();
    }

    @When("the user proverjava ima li vehce sazdaden takav voucher i ako ima, go iztriva")
    public void the_user_proverjava_ima_li_vehce_sazdaden_takav_voucher_i_ako_ima_go_iztriva() {
        GiftVoucherDelete.giftVoucherDelete();
        //throw new cucumber.api.PendingException();
    }

    @When("the user sazdava nov voucher")
    public void the_user_sazdava_nov_voucher() {
        CreationNewVoucher.setVoucherCode();
        //throw new cucumber.api.PendingException();
    }


@Then("proverjavame dali vouchera e uspeshno sazdaden")
    public void proverjavame_dali_vouchera_e_uspeshno_sazdaden() {
    SuccessfulFunction.proverjavame_dali_vouchera_e_uspeshno_sazdaden();


}
    // throw new cucumber.api.PendingException();
}



