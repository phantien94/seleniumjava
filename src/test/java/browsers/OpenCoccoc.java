package browsers;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenCoccoc {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Users\\Tien\\AppData\\Local\\CocCoc\\Browser\\Application\\browser.exe");
        new ChromeDriver(options);

    }
}
