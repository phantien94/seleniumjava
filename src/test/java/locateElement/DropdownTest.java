package locateElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import supports.Browser;

public class DropdownTest {
    public static void main(String[] args) {
        Browser.openBrowsers("chrome");
        Browser.visit("https://the-internet.herokuapp.com/dropdown");

        Browser.select(How.ID,"dropdown",1);
        Browser.select(How.ID,"dropdown","1");
        Browser.selectByVisibleText(How.ID,"dropdown","Option 1");
    }
}
