package steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import pages.CertsPage;

public class CertsPageSteps {
    CertsPage page;

    @Step
    public void openPage(){
        page.open();
    }

    @Step
    public void open_certificate_page(){
        page.openCertsPage();
    }
    @Step
    public void open_request_tab(){
        page.openReqsTab();
    }
    @Step
    public void add_request(){
        page.addRequest();
    }
    @Step
    public void select_gost(){
        page.selectGost();
    }
    @Step
    public void type_server_name(){
        page.typeServerName();
    }
    @Step
    public void type_organization_name(){
        page.typeOrganizationName();
    }
    @Step
    public void click_apply(){
        page.clickApply();
    }
    @Step
    public void select_row(){
        page.selectRow();
    }
    @Step
    public void click_export(){
        page.clickExport();
    }
    @Step
    public void check_request_exists(){
        Assert.assertTrue(page.findRequest());
    }
    @Step
    public void check_certificates_exist(){
        Assert.assertTrue(page.findCerts());
    }
    @Step
    public void open_certificate_tab(){
        page.openCertsTab();
    }
    @Step
    public void click_import(){
        page.clickImportButton();
    }
    @Step
    public void input_file_name(){
        page.inputFileName();
    }
}
