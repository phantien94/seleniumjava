package testcases.locateElement;

import org.openqa.selenium.support.How;
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
