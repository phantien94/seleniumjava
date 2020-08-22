package testcases.locateElement;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import supports.Browser;

public class KeyBoardTest {
    public static void main(String[] args) {
        Browser.openBrowsers("chrome");
        Browser.visit("https://the-internet.herokuapp.com/key_presses");
        Actions keyBoard = new Actions(Browser.getDriver());
        //keyBoard.keyDown(Keys.valueOf("A")).perform();
        keyBoard.sendKeys(Keys.valueOf("A"));
    }
}
