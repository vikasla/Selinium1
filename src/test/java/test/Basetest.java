package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import pack.Loginpage;

public class Basetest  {
	public static WebDriver driver;
	public Properties prop;
	public FileInputStream fis;
	
	String path= (System.getProperty("user.dir")+"\\src\\test\\resources\\configure.properties");
@BeforeSuite
public void initbrowser() throws IOException {
	WebDriverManager.chromedriver().setup();
	//step 1
	driver=new ChromeDriver();
	// step 2
	driver.manage().window().maximize();
	//step 3
	prop=new Properties();
	fis =new FileInputStream(path);
	prop.load(fis);
	//driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.get(prop.getProperty("url"));
	//step 4
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
	@AfterSuite
	public void teardown() throws InterruptedException {
		Thread.sleep(2000);
		//driver.quit();
	}

}

