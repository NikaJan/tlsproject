package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import pages.CertificationServicesPage;

import java.io.IOException;

public class CertificationServicesSteps {
    CertificationServicesPage page;

    @Step
    public void open_certificate_page(){
        page.open();
    }
    @Step
    public void click_request_link(){
        page.clickRequestLink();
    }
    @Step
    public void click_extended_request_link(){
        page.clickExtendedRequestLink();
    }
    @Step
    public void read_request(){
        try {
            page.readRequest();
        } catch (IOException e) {
            e.printStackTrace();
            Assert.assertNotNull(e);
        }
    }
    @Step
    public void type_request_body(){
        page.enterRequestBoby();
    }
    @Step
    public void click_submit_button(){
        page.clickSubmit();
    }
    @Step
    public void click_download_sertificate(){
        page.clickDownloadLink();
    }
}
