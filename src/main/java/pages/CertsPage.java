package pages;

import org.openqa.selenium.*;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.interactions.Actions;

import java.io.File;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

@DefaultUrl("http://172.17.117.121")
public class CertsPage extends PageObject {
    private By certsPage = By.className("icomoon-tls-certificats-16");
    private By requestTab = By.xpath("//*[@class='toolbar-tabs__item-title' and contains(text(), 'ЗАПРОСЫ')]");
    private By addButton = By.xpath("//*[@class='toolbar__item-icon' and @title='Создать']");
    private By gostComboBox = By.className("Select-control");
    private By gost12 = By.id("react-select-2--option-1");
    private By input = By.xpath("//input[@class='text-input']");
    private By applyButton = By.xpath("//*[@class='button button--accent button--fixed' and text()='Применить']");
    private By requestsTable = By.cssSelector("table#content-block__table content-block__table--wide content-block__table--reactable");
    private By requestsRows = By.className("content-block__table-item");
    private By exportButton = By.cssSelector("i[class='icomoon-action-export']");
    private By certsTab = By.xpath("//*[@class='toolbar-tabs__item-title' and contains(text(), 'СЕРТИФИКАТЫ')]");
    private By importButton = By.xpath("//*[@class='toolbar__item-title' and contains(text(), 'Импортировать')]");
    private By uploadFile = By.xpath("//*[@class='rc-upload']/input");

    public void openCertsPage() {
        find(certsPage).click();
    }

    public void openReqsTab() {
        find(requestTab).click();
    }

    public void addRequest() {
        find(addButton).click();
    }

    public void selectGost2012() {
        find(gostComboBox).click();
        find(gost12).click();
    }

    public void typeServerName() {
        findAll(input).get(1).type("test.local2");
    }

    public void typeOrganizationName() {
        findAll(input).get(5).type("organization");
    }

    public void clickApply() {
        find(applyButton).click();
    }

    public void selectRow() {
        findAll(requestsRows).get(0).click();
    }

    public void clickExport() {
        find(exportButton).click();
    }

    public boolean findRequest() {
        File requestFile = new File("C:\\Users\\jq\\Downloads\\req-11.p10");
        return requestFile.exists();
    }

    public boolean findCerts() {
        File certsFile = new File("C:\\Users\\jq\\Downloads\\certnew.cer");
        return certsFile.exists();
    }

    public void openCertsTab() {
        find(certsTab).click();
    }

    public void clickImportButton() {
        find(importButton).click();
    }

    public void inputFileName() {
        find(uploadFile).sendKeys("C:\\Users\\jq\\Downloads\\certnew.cer");
    }
}
