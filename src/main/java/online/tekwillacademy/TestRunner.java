package online.tekwillacademy;

import online.tekwillacademy.managers.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

public class TestRunner {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverManager.getInstance().getDriver();

        String currentTabName = driver.getWindowHandle();
        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-firefox-driver");
Thread.sleep(5000);
        driver.close();

        driver.switchTo().window(currentTabName);

        driver.get("https://tekwillacademy-opencart.online/");
        driver.quit();


        System.out.println("The driver is closed");



    }
}