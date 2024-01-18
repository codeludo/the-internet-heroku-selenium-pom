package runners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormAuth {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/login");
        System.out.println("page is launched successfully");

        driver.close();

    }
}
