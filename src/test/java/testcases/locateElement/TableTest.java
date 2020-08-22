package testcases.locateElement;

import org.openqa.selenium.By;
import org.openqa.selenium.support.How;
import supports.Browser;

public class TableTest {
    public static void main(String[] args) {
        Browser.openBrowsers("chrome");
        Browser.visit("https://the-internet.herokuapp.com/tables");

        int totalRows = Browser.getDriver().findElements(By.xpath("//table[@id='table1']/tbody/tr")).size();
        int totalCols = Browser.getDriver().findElements(By.xpath("//table[@id='table1']/thead/tr/th")).size();

        for (int row = 1; row <= totalRows; row++){
            String lastName = Browser.getText(How.XPATH,String.format("//table[@id='table1']/tbody/tr[%d]/td[%d]",row,1));
            String firstName = Browser.getText(How.XPATH,String.format("//table[@id='table1']/tbody/tr[%d]/td[%d]",row,2));
            System.out.println(String.format("%s %s",firstName, lastName));

        }


    }
}
