package project_bdd.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseSetup {
    private static WebDriver driver;

    public void setupBrowser() {
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://dev.insurance.tekschool-students.com/");
    }
    private Properties readProperties(){
        //Full file path to the configuration file.
        //System.getProprty("user.dir") return directory up to project level.
        String propertyFilePath = System.getProperty("user.dir")
                + "/src/test/resources/configs/qa-env.properties";
        //Create and Object of Properties Class in java.util package.
        Properties properties = new Properties();
        try {
            FileInputStream inputStream = new FileInputStream(propertyFilePath);
            properties.load(inputStream);
        }catch (IOException ex) {
            ex.printStackTrace();
            throw new RuntimeException("Can not read property file");
        }
        return properties;
    }

    //Having only Getter for Encapsulated variable we only give other objects.
    //a read-only access.


    public void closeBrowser(){
        if(driver!=null){
            driver.quit();
        }
    }
    public WebDriver getDriver() {
        return driver;
    }

}
