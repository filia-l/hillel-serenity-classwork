package jbehave.scenariosteps.booking_uz;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class BookingUzScenario {

    @Given("user proceeds to cite, using url: '$bookingUrl")
    public void navigateToBookingSite(final String url) {

    }

    @When("user searches E-tickets, by next criteria: $criteria")
    public void performTicketsSearch(final ExamplesTable criteria) {

    }

    @Then("following trains are available to book: $expectedTrainList")
    public void verifyAvailableTrainList(final ExamplesTable expectedTrainList) {

    }
}
