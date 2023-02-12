package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class RoomsPage {

    private WebDriver driver;
    private By contactName = By.id("name");
    private By contactEmail = By.id("email");
    private By contactPhone = By.id("phone");
    private By contactSubject = By.id("subject");
    private By contactMessage = By.id("description");
    private By submitButton = By.id("submitContact");
    private By bookRoomButton = By.xpath("//*[@id=\"root\"]/div/div/div[4]/div/div/div[3]/button");
    private By bookFirstName = By.className("room-firstname");
    private By bookLastName = By.className("room-lastname");
    private By bookEmail = By.className("room-email");
    private By bookPhone = By.className("room-phone");
    private By bookStartDate = By.xpath("//*[@id=\"root\"]/div/div/div[4]/div/div[2]/div[2]/div/div[2]/div[4]/div[1]/div[5]");
    private By bookEndDate = By.xpath("//*[@id=\"root\"]/div/div/div[4]/div/div[2]/div[2]/div/div[2]/div[4]/div[1]/div[6]");
    private By bookButton = By.xpath("//*[@id=\"root\"]/div/div/div[4]/div/div[2]/div[3]/button[2]");
    private By bookCloseButton = By.xpath("/html/body/div[4]/div/div/div[2]/div/button");


    public RoomsPage(WebDriver driver){
        this.driver = driver;
    }

        public void setContactName(String name) {
            driver.findElement(contactName).sendKeys(name);
        }
        public void setContactEmail(String email) {
            driver.findElement(contactEmail).sendKeys(email);
        }
        public void setContactPhone(String phone) {
            driver.findElement(contactPhone).sendKeys(phone);
        }
        public void setContactSubject(String subject) { driver.findElement(contactSubject).sendKeys(subject); }
        public void setContactMessage(String description) { driver.findElement(contactMessage).sendKeys(description);}


        public void setBookFirstName(String bfirstname)  {
            driver.findElement(bookFirstName).sendKeys(bfirstname);
        }
        public void setBookLastName(String blastname)  {
            driver.findElement(bookLastName).sendKeys(blastname);
        }
        public void setBookEmail(String bemail)  {
        driver.findElement(bookEmail).sendKeys(bemail);
        }
        public void setBookPhone(String bphone)  {
            driver.findElement(bookPhone).sendKeys(bphone);
        }
        public void setBookStartDate(String bstartdate)  { driver.findElement(bookStartDate).sendKeys(bstartdate);}
        public void setBookEndDate(String benddate)  { driver.findElement(bookEndDate).sendKeys(benddate);}


    public ContactFormSuccess clickSubmitButton() {
        driver.findElement(submitButton).click();
        return new ContactFormSuccess(driver);

    }

    public BookFormSuccess clickBookButton() {
        driver.findElement(bookButton).click();
        return new BookFormSuccess(driver);
    }

    public void clickBookRoomButton(){
        driver.findElement(bookRoomButton).click();
    }

    public void clickBookCloseButton(){
        driver.findElement(bookCloseButton).click();
    }





}
