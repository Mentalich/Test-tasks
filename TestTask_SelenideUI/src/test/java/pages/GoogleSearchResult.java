package pages;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.files.FileFilter;
import com.codeborne.selenide.selector.*;
import org.openqa.selenium.By;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class GoogleSearchResult {
    private SelenideElement pictureTabButton = $("div.hdtb-mitem:nth-child(2) > a:nth-child(1)");
    public SelenideElement getPictureTabButton() {
        return pictureTabButton;
    }

    private SelenideElement resultTable = $(".KAlRDb");
    private SelenideElement result = $("div.isv-r:nth-child(4)");
    public void savePicture() throws IOException, URISyntaxException {
        result.click();
        download(resultTable.getAttribute("src"));

    }
}
