package testcases.locateElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.How;
import supports.Browser;


public class DragDropTest {
    public static void main(String[] args) {
        Browser.openBrowsers("chrome");
        Browser.visit("https://the-internet.herokuapp.com/drag_and_drop");

        Actions mouseActions = new Actions(Browser.getDriver());
//        mouseActions
//                .dragAndDrop(
//                Browser.find(How.ID,"column-a"),
//                Browser.find(How.ID,"column-b")
//                )
//                .perform();

        mouseActions
                .clickAndHold(Browser.find(How.ID,"column-a"))
                .moveToElement(Browser.find(How.ID,"column-b"))
                .release()
                .perform();
    }
}
