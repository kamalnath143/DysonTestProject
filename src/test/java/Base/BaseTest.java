package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseTest {

   protected WebDriver driver;

   @BeforeMethod(alwaysRun = true)
    public void setup() throws IOException {
       // Properties class
       Properties prop = new Properties();
       FileInputStream fil = new FileInputStream(System.getProperty("user.dir") + "//src//main//Resources//Config.properties");
       prop.load(fil);
       String browser = prop.getProperty("browser");
       String url = prop.getProperty("url");

       if (browser.equalsIgnoreCase("chrome")) {
           WebDriverManager.chromedriver().setup();
           driver = new ChromeDriver();
           driver.get(url);
       } else if (browser.equalsIgnoreCase("firefox")) {
           WebDriverManager.firefoxdriver().setup();
           driver = new FirefoxDriver();
           driver.get(url);
       } else if (browser.equalsIgnoreCase("edge")) {
           WebDriverManager.edgedriver().setup();
           driver = new EdgeDriver();
           driver.get(url);
       }
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   }
    @AfterMethod(alwaysRun = true)
    public void windowclose()
    {
        driver.quit();
    }

}

