import org.junit.jupiter.api.Test;
import pages.GoogleHomePage;
import pages.GoogleSearchResult;

import java.io.IOException;
import java.net.URISyntaxException;

import static com.codeborne.selenide.Selenide.open;

public class UI_test_default {
   @Test
    public void searchTarget() throws IOException, URISyntaxException {
       open("https://www.google.com");
       new GoogleHomePage().search("Зеленина Татьяна");
       GoogleSearchResult result = new GoogleSearchResult();
       result.getPictureTabButton().click();
       result.savePicture();
   }
}
