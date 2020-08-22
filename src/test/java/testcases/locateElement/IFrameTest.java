package testcases.locateElement;

import org.openqa.selenium.By;
import supports.Browser;

public class IFrameTest {
    public static void main(String[] args) {
        Browser.openBrowsers("chrome");
        Browser.visit("https://the-internet.herokuapp.com/iframe");

        Browser.getDriver().switchTo().frame("mce_0_ifr");
        Browser.getDriver().findElement(By.xpath("//body/p")).clear();
        Browser.getDriver().findElement(By.xpath("//body/p")).sendKeys("hello");
//        Browser.fill(How.XPATH,"html/body/p","hello");
    }
}
