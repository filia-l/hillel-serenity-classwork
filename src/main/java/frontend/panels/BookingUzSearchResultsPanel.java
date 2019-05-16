package frontend.panels;

import dto.AvailableTrainDTO;
import frontend.pages.AbstractPage;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class BookingUzSearchResultsPanel extends AbstractPanel {

    private static final String SEARCH_RESULT_LIST = ".//tr[not(@class='no-place') and position() > 1]";

    public BookingUzSearchResultsPanel(final WebElementFacade panelBaseLocation, final AbstractPage rootPage) {
        super(panelBaseLocation, rootPage);
    }

    public List<AvailableTrainDTO> getSearchResults() {
        return getRootPage().findAll(SEARCH_RESULT_LIST)
                .stream()
                .map(item -> {
                    final WebElementFacade trainNumber = item.findBy(".//td[@class='num']/div");
                    final WebElementFacade from = item.findBy(".//td[@class='station']/div[@class='name' and position()=2]");
                    final WebElementFacade to = item.findBy(".//td[@class='station']/div[@class='name' and position()=3]");
                    final WebElementFacade trainNumber = item.findBy(".//td[@class='num']/div");
                    final WebElementFacade trainNumber = item.findBy(".//td[@class='num']/div");
                    final WebElementFacade trainNumber = item.findBy(".//td[@class='num']/div");
                })
    }
}
