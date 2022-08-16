package pages;

import com.codeborne.selenide.SelenideElement;

import java.io.IOException;
import java.net.URISyntaxException;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.download;

public class GoogleSearchResult {
    private SelenideElement pictureTabButton = $("div.hdtb-mitem:nth-child(2) > a:nth-child(1)");
    public SelenideElement getPictureTabButton() {
        return pictureTabButton;
    }

    private SelenideElement result = $("div.isv-r:nth-child(4)");
    private SelenideElement resultTable = $(".KAlRDb");
        public void savePicture() throws IOException, URISyntaxException {
        result.click();
        download(resultTable.getAttribute("src"));
    }
}
