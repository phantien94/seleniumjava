package locateElement;

import org.openqa.selenium.support.How;
import supports.Browser;

public class CheckboxesTest {
    public static void main(String[] args) {
        Browser.openBrowsers("chrome");
        Browser.visit("https://the-internet.herokuapp.com/checkboxes");

        Browser.uncheck(How.XPATH,"//form[@id='checkboxes']/input[1]");
        Browser.uncheck(How.XPATH,"//form[@id='checkboxes']/input[2]");

    }
}
