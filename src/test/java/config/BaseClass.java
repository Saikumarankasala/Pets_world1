package config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
 public static WebDriver driver;
 public static TakesScreenshot ts;
 public static JavascriptExecutor ex;
 public static Properties pro;
 
@BeforeSuite
public void openSuite() {
	
}

@BeforeMethod
public void openBrowser() throws IOException {
 driver=launchBrowser(getProperties("browser"));
	
}

 public WebDriver launchBrowser(String browser) {
	 switch(browser) {
	 case"chrome":
		 WebDriverManager.chromiumdriver().setup();
		 //System.setProperty("websdriver.chrome.driver",System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		 //System.out.println(System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		 driver= new ChromeDriver();
	   break;
	   
	 case"edge":
		 WebDriverManager.edgedriver().setup();
		 //System.setProperty("websdriver.chrome.driver",System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		 //System.out.println(System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		 driver= new EdgeDriver();
	   break;
	 case"firefox":
		 WebDriverManager.firefoxdriver().setup();
		 //System.setProperty("websdriver.chrome.driver",System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		 //System.out.println(System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		 driver= new FirefoxDriver();
	   break;
	   default:
		   System.out.println("  no driver found");
		   break;
	 }
	 return driver;
 }
 
  public String getProperties(String key) throws IOException {
	  String value="";
	  File f= new File(System.getProperty("user.dir")+"//config.properties");
	  FileInputStream fis= new FileInputStream(f);
	  pro= new Properties();
	  pro.load(fis);
	 value=pro.getProperty(key);
	 return value;
  }
  
  public WebDriver getDriver() {
	  WebDriver localDriver=this.driver;
	  return localDriver;
  }
  
  @AfterMethod
  public void Teardown() {
	   if(driver!=null) {
		   driver.quit();
	   }
  }
   @AfterSuite
   public void closeSuite() {
	   
   }
}
