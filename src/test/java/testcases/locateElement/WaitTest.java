package testcases.locateElement;

import org.openqa.selenium.support.How;
import supports.Browser;

public class WaitTest {
    public static void main(String[] args) {
        Browser.openBrowsers("chrome");
        Browser.visit("https://the-internet.herokuapp.com/dynamic_loading/1");

        Browser.click(How.XPATH,"//button[.='Start']");
        System.out.println(Browser.getText(How.ID,"finish"));

    }
}
