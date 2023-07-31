package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertsPage {

    private WebDriver driver;
    private By results = By.id("result");

    private By prompt = By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button");
    private By triggerAlertButton = By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button");
    private By triggerConfirmButton = By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button");
    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void triggerAlert(){
        driver.findElement(triggerAlertButton).click();
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }

    public String getResult(){
        return driver.findElement(results).getText();
    }

    public void triggerCofirm(){
        driver.findElement(triggerConfirmButton).click();
    }

    public void alert_clickToDismiss(){
        driver.switchTo().alert().dismiss();
    }

    public String alertgetText(){
        return driver.switchTo().alert().getText();
    }

    public void triggerPrompt(){
        driver.findElement(prompt).click();
    }

   public void alert_setInput(String text){
        driver.switchTo().alert().sendKeys(text);

   }

}
