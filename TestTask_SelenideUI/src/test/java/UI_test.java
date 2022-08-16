import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import pages.FirefoxHomePage;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.GoogleSearchResult;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;

import static com.codeborne.selenide.Selenide.open;

public class UI_test {
   @Test
    public void searchTarget() throws IOException, URISyntaxException {
       open("https://www.google.com");
       new FirefoxHomePage().search("Зеленина Татьяна");
       GoogleSearchResult result = new GoogleSearchResult();
       result.getPictureTabButton().click();
       result.savePicture();
   }
}
