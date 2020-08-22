package testcases.locateElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.How;
import supports.Browser;

public class HoverTest {
    public static void main(String[] args) {
        Browser.openBrowsers("chrome");
        Browser.visit("https://the-internet.herokuapp.com/hovers");

        Actions mouseActions = new Actions(Browser.getDriver());
        mouseActions.moveToElement(Browser.find(How.XPATH,"//div[@class='figure'][2]")).perform();
        System.out.println(Browser.getText(How.XPATH,"//div[@class='figure'][2]/div/h5"));
    }
}
