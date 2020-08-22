package testcases.locateElement;

import org.openqa.selenium.support.How;
import supports.Browser;

public class NesteFramesTest {
    public static void main(String[] args) {
        Browser.openBrowsers("chrome");
        Browser.visit("https://the-internet.herokuapp.com/nested_frames");
        Browser.getDriver().switchTo().frame("frame-top");
        Browser.getDriver().switchTo().frame("frame-left");
        System.out.println(Browser.getText(How.XPATH,"html/body"));

        Browser.getDriver().switchTo().parentFrame();// back to frame-left
        Browser.getDriver().switchTo().frame("frame-middle");
        System.out.println(Browser.getText(How.ID,"content"));

        Browser.getDriver().switchTo().parentFrame();// back to frame-left
        Browser.getDriver().switchTo().frame("frame-right");
        System.out.println(Browser.getText(How.XPATH,"html/body"));
        Browser.getDriver().switchTo().parentFrame();// back to frame-left

        Browser.getDriver().switchTo().parentFrame();// back to origin

        Browser.getDriver().switchTo().frame("frame-bottom"); //go to frame-bottom
        System.out.println(Browser.getText(How.XPATH,"html/body"));
        Browser.getDriver().switchTo().parentFrame();// back to origin

    }
}
