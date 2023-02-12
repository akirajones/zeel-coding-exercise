package book;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.BookFormSuccess;
import pages.RoomsPage;

import static org.testng.Assert.assertTrue;

public class BookTest extends BaseTests {

    BookFormSuccess bookFormSuccess;

    @Test
    public void testBookingSubmission(){
        RoomsPage roomsPage = homePage.clickHackButton();
        roomsPage.clickBookRoomButton();
        /* roomsPage.setBookStartDate("2022-02-16");
        roomsPage.setBookEndDate("2022-02-17");  */
        roomsPage.setBookFirstName("Grace");
        roomsPage.setBookLastName("Hopper");
        roomsPage.setBookEmail("grace.hopper@zeel.com");
        roomsPage.setBookPhone("347-555-9898");


        BookFormSuccess bookFormSuccess = roomsPage.clickBookButton();
        assertTrue(bookFormSuccess.getBookingConfirmedText().contains("Booking Successful!"));
        roomsPage.clickBookCloseButton();

    }


}
