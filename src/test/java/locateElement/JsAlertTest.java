package locateElement;

import org.openqa.selenium.support.How;
import supports.Browser;

public class JsAlertTest {
    public static void main(String[] args) {
        Browser.openBrowsers("chrome");
        Browser.visit("https://the-internet.herokuapp.com/javascript_alerts");

        clickJSButton("Click for JS Alert");
        Browser.acceptAlert();
        System.out.println(Browser.getText(How.ID,"result"));

        clickJSButton("Click for JS Confirm");
        Browser.dismissAlert();
        System.out.println(Browser.getText(How.ID,"result"));

        clickJSButton("Click for JS Prompt");
        Browser.acceptAlert("hahahaha");
        System.out.println(Browser.getText(How.ID,"result"));
    }

    public static void clickJSButton(String visibleText){
        Browser.click(How.XPATH,String.format("//button[.='%s']",visibleText));
    }
}
