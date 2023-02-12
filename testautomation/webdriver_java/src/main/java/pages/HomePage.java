package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By hackButton = By.cssSelector("button.btn-primary");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }


    public RoomsPage clickHackButton(){
       driver.findElement(hackButton).click();
       return new RoomsPage(driver);
    }



}


