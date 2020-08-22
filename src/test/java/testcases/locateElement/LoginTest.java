package testcases.locateElement;

import org.openqa.selenium.support.How;
import supports.Browser;

public class LoginTest {
    public static void main(String[] args) {
        Browser.openBrowsers("chrome");

        Browser.visit("https://the-internet.herokuapp.com/login");

        Browser.fill(How.ID,"username","tomsmith");
        Browser.fill(How.ID,"password","SuperSecretPassword!");
        Browser.click(How.XPATH,"//button[@type=submit]");



    }
}
