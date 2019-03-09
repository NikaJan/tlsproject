package tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.CertificationServicesSteps;
import steps.CertsPageSteps;

@RunWith(SerenityRunner.class)
public class CertsTest {

    @Managed
    WebDriver driver;

    @Steps
    private CertsPageSteps steps;

    @Steps
    CertificationServicesSteps certSteps;

    @Test
    public void createNewCert() {
        /*steps.openPage();
        steps.open_certificate_page();
        steps.open_request_tab();
        steps.add_request();
        steps.selectGost2012();
        steps.type_server_name();
        steps.type_organization_name();
        steps.click_apply();
        steps.select_row();
        steps.click_export();
        certSteps.open_certificate_page();
        certSteps.click_request_link();
        certSteps.click_extended_request_link();
        certSteps.read_request();
        certSteps.type_request_body();
        certSteps.click_submit_button();
        certSteps.click_download_sertificate();*/
        steps.check_certificates_exist();
        steps.openPage();
        steps.open_certificate_page();
        steps.open_certificate_tab();
        //steps.click_import();
        steps.input_file_name();
    }
}
