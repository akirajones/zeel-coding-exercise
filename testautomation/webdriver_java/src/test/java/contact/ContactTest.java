package contact;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ContactFormSuccess;
import pages.RoomsPage;
import static org.testng.Assert.*;

public class ContactTest extends BaseTests {

    ContactFormSuccess contactFormSuccess;

    @Test
    public void testContactSubmission(){
       RoomsPage roomsPage = homePage.clickHackButton();
       roomsPage.setContactName("Ada Lovelace");
       roomsPage.setContactEmail("ada.lovelace@zeel.com");
       roomsPage.setContactPhone("347-555-1212");
       roomsPage.setContactSubject("Planning a company retreat");
       roomsPage.setContactMessage("Shady Meadows is great!");

       ContactFormSuccess contactFormSuccess = roomsPage.clickSubmitButton();
      // assertTrue(contactFormSuccess.getThanksText().contains("Thanks for getting in"));



    }
}
