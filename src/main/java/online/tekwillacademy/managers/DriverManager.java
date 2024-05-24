package online.tekwillacademy.managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverManager {
    private static String webDriverType = "Chrome";
    private static DriverManager instance;
    private WebDriver driver;
    private DriverManager(){
        switch (webDriverType){
            case "Chrome":
                driver = new ChromeDriver();

                System.out.println("Chrome driver was initiated");
                break;
            case "Firefox":
                driver = new FirefoxDriver();
                System.out.println("Firefox was initiated");
                break;
            case "Safari":
                driver = new SafariDriver();
                System.out.println("Safari initiated");
                break;
            case "Edge":
                driver = new EdgeDriver();
                System.out.println("Edge was initiated");
                break;
            default:
                System.out.println("The webDriverType....");
        }
        driver.manage().window().maximize();
    }

    public static DriverManager getInstance(){
        if (instance == null){
            instance = new DriverManager();
        }
        return instance;
    }

    public WebDriver getDriver() {
        if (driver == null){
            DriverManager.getInstance();
        }
        return driver;
    }
}
