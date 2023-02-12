package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactFormSuccess {
    private WebDriver driver;
    private By thanksText = By.xpath("//*[@id=\"root\"]/div/div/div[5]/div[2]/div/h2/text()[1]");

    public ContactFormSuccess(WebDriver driver){
        this.driver = driver;
    }

    public String getThanksText(){
        return driver.findElement(thanksText).getText();
    }



}
