package pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

import java.io.*;

@DefaultUrl("http://172.17.7.27/certsrv/")
public class CertificationServicesPage extends PageObject {
    private By requestLink = By.id("locLblRequestCert");
    private By extendedRequestLink = By.id("locAdvReqLabelContd");
    private String requestBody;
    private By requestInput = By.id("locTaRequest");
    private By submitButton = By.id("btnSubmit");
    private By downloadCertsLink = By.id("locDownloadCert3");

    public void clickRequestLink() {
        find(requestLink).click();
    }

    public void clickExtendedRequestLink() {
        find(extendedRequestLink).click();
    }

    public void readRequest() throws IOException {
        requestBody = "";
        {
            FileReader file = new FileReader("C:\\Users\\jq\\Downloads\\req-11.p10");
            BufferedReader reader = new BufferedReader(file);
            String line = reader.readLine();

            while (line != null) {
                requestBody += line;
                line = reader.readLine();
            }
        }
    }

    public void enterRequestBoby() {
        find(requestInput).type(requestBody);
    }

    public void clickSubmit() {
        find(submitButton).click();
    }

    public void clickDownloadLink() {
        find(downloadCertsLink).waitUntilVisible().click();
    }
}
