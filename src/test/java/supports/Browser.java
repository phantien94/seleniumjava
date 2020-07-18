package supports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.How;

import java.util.HashMap;
import java.util.Map;

public class Browser {
    private static WebDriver driver;
    public static WebDriver openBrowsers(String name){
        switch (name.toLowerCase()) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "ie":
                driver = new InternetExplorerDriver();
                break;
            default:
                throw new IllegalArgumentException("The browser " + name + " does not support");
        }
        return driver;
    }

    public static WebDriver openHeadlessBrowser (String name){
        switch (name.toLowerCase()) {
            case "chrome": {
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--headless");
                return new ChromeDriver(chromeOptions);
            }
            case "firefox": {
                FirefoxBinary firefoxBinary = new FirefoxBinary();
                firefoxBinary.addCommandLineOptions("--headless");
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.setBinary(firefoxBinary);
                return new FirefoxDriver(firefoxOptions);
            }

            default:
                throw new IllegalArgumentException("The browser " + name + " does not support");
        }
    }

    public static WebDriver openChromeMobileViewPort (String deviceName){
        Map<String, Object> mobileEmulation = new HashMap<String, Object>();
        mobileEmulation.put("deviceName", deviceName);
        ChromeOptions opts = new ChromeOptions();
        opts.setExperimentalOption("mobileEmulation", mobileEmulation);
        return new ChromeDriver(opts);
    }

    public static void visit(String url) {
        driver.get(url);

    }

    public static void backToPreviousPage(){
        driver.navigate().back();
    }

    public static WebElement find(How by, String locator){
       return driver.findElement(by.buildBy(locator));
    }

    public static void fill (How by, String locator, String withText){
        find(by, locator).sendKeys(withText);
    }

    public static void click (How by, String locator){
        find(by, locator).click();
    }

    public static void check (How how, String locator){
        if(!find(how, locator).isSelected())
            click(how, locator);
    }

    public static void uncheck (How how, String locator){
        if(find(how, locator).isSelected())
            click(how, locator);
    }
}
