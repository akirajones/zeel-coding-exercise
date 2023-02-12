package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class BookFormSuccess {
    private WebDriver driver;
    private By bookingConfirmedText = By.xpath("/html/body/div[4]/div/div/div[1]/div[2]");


    public BookFormSuccess(WebDriver driver){
        this.driver = driver;
    }

    public String getBookingConfirmedText(){
        return driver.findElement(bookingConfirmedText).getText();
    }



}