package serenity.steps.booking_uz;

import frontend.pages.BookingUzMainPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class BookingUzMainPageSteps extends ScenarioSteps {

    private BookingUzMainPage bookingUzMainPage;

    public BookingUzMainPageSteps(final Pages pages) {
        bookingUzMainPage = pages.getPage(BookingUzMainPage.class);
    }

    @Step
    public void selectTravelDestination(final String from, final String to) {
        bookingUzMainPage.getBookingUzSearchPanel().selectTravelDate(from, to);
    }

    @Step
    public void clickSearchButton() {
        bookingUzMainPage.getBookingUzSearchPanel().clickSearchButton();
    }
}
