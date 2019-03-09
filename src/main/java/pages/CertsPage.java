package pages;

import org.openqa.selenium.*;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.interactions.Actions;

import java.io.File;

@DefaultUrl("https://dropmefiles.com/")
//@DefaultUrl("http://172.17.117.121")
public class CertsPage extends PageObject {
    private By certsPage = By.className("icomoon-tls-certificats-16");
    private By requestTab = By.xpath("//*[@class='toolbar-tabs__item-title' and contains(text(), 'ЗАПРОСЫ')]");
    private By addButton = By.xpath("//*[@class='toolbar__item-icon' and @title='Создать']");
    private By gostComboBox = By.className("Select-control");
    private By gost12 = By.className("Select-value-label");
    private By input = By.xpath("//input[@class='text-input']");
    private By applyButton = By.xpath("//*[@class='button button--accent button--fixed' and text()='Применить']");
    private By requestsTable = By.cssSelector("table#content-block__table content-block__table--wide content-block__table--reactable");
    private By requestsRows = By.className("content-block__table-item");
    private By exportButton = By.cssSelector("i[class='icomoon-action-export']");
    private By certsTab = By.xpath("//*[@class='toolbar-tabs__item-title' and contains(text(), 'СЕРТИФИКАТЫ')]");
    private By importButton = By.xpath("//*[@class='toolbar__item-title' and contains(text(), 'Импортировать')]");
    private By uploadFile = By.xpath("//*[@class='rc-upload']/input");

    public void openCertsPage(){
        find(certsPage).click();
    }
    public void openReqsTab(){
        find(certsPage).click();
    }
    public void addRequest(){
        find(addButton).click();
    }
    public void selectGost(){
        find(gostComboBox).click();
    }
    public void typeServerName(){
        findAll(input).get(1).type("test.local2");
    }
    public void typeOrganizationName(){
        findAll(input).get(5).type("organization");
    }
    public void clickApply(){
        find(applyButton).click();
    }
    public void selectRow(){
        findAll(requestsRows).get(0).click();
    }
    public void clickExport(){
        find(exportButton).click();
    }

    public boolean findRequest(){
        File requestFile = new File("C:\\Users\\Вероника\\Downloads\\req-5.p10");
        return requestFile.exists();
    }
    public boolean findCerts(){
        File certsFile = new File("C:\\Users\\Вероника\\Downloads\\certnew.cer");
        return certsFile.exists();
    }
    public void openCertsTab(){
        find(certsTab).click();
    }
    public void clickImportButton(){
        find(importButton).click();
    }
    public void inputFileName() {

        By text = By.id("browse_btn_x");
        find(text).click();
        Actions actions = new Actions(getDriver());
        find(text).sendKeys("C:\\Users\\Вероника\\Downloads\\certnew.cer");
        //actions.sendKeys("C:\\Users\\Вероника\\Downloads\\certnew.cer");
        //find(uploadFile).sendKeys("C:\\Users\\Вероника\\Downloads\\certnew.cer");
    }
}
