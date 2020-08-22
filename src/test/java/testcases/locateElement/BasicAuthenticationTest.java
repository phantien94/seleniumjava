package testcases.locateElement;

import supports.Browser;

public class BasicAuthenticationTest {
    public static void main(String[] args) {
        Browser.openBrowsers("chrome");
        Browser.visit("https://admin:admin@the-internet.herokuapp.com/basic_auth");

    }
}
