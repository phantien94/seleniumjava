package testcases.locateElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.How;
import supports.Browser;

public class RightClickTest {
    public static void main(String[] args) {
        Browser.openBrowsers("chrome");
        Browser.visit("https://the-internet.herokuapp.com/context_menu");

        Actions mouseActions = new Actions(Browser.getDriver());
        mouseActions.contextClick(Browser.find(How.ID,"hot-spot")).perform();
    //    mouseActions.doubleClick()
    }
}
