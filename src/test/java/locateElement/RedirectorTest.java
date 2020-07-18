package locateElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.How;
import supports.Browser;

public class RedirectorTest {
    public static void main(String[] args) {

        Browser.openBrowsers("chrome");
        Browser.visit("https://the-internet.herokuapp.com/redirector");

        Browser.click(How.LINK_TEXT,"here");

        Browser.click(How.LINK_TEXT,"200");
        Browser.backToPreviousPage();

        Browser.click(How.LINK_TEXT,"301");
        Browser.backToPreviousPage();

        Browser.click(How.LINK_TEXT,"404");
        Browser.backToPreviousPage();

        Browser.click(How.LINK_TEXT,"500");
        Browser.backToPreviousPage();

        Browser.click(How.LINK_TEXT,"here");

        
    }
}
