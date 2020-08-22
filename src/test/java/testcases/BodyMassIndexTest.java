package testcases;

import functions.BmiCalculatorFunction;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import supports.Browser;

public class BodyMassIndexTest {

    @Parameters({"browser","url"})
    @BeforeMethod
    public static void precondition(String browser, String url){
        Browser.openBrowsers(browser);
        Browser.visit(url);
    }

    @Test(description = "validate bmi calculator in metric unit")
    public static void metricUnit() {
        BmiCalculatorFunction calculatorPage = new BmiCalculatorFunction();
        calculatorPage.selectMetricTab();
        calculatorPage.fillForm("26","female","162","68");

        Assert.assertEquals(calculatorPage.getResult(),"BMI = 20.1 kg/m2   (Normal)");

    }


}
