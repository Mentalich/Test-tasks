package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class GoogleHomePage {
    private SelenideElement searchField = $(By.name("q"));
    public void search(String input){searchField.val(input).pressEnter();}
}
