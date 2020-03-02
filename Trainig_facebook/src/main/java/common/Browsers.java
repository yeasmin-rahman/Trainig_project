package common;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Browsers {
public static WebDriver driver;	
  @Test
  public void f() {
  }
  @BeforeClass
  @Parameters({"url","browser"})
  public void beforeClass(String wbsite,String br) {
	  if(br.equalsIgnoreCase("chrome")) {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\SMR\\.eclipse\\Trainig_facebook\\Drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.navigate().to(wbsite);
	  driver.manage().window().maximize();
  }else if(br.equalsIgnoreCase("firefox")) {
    System.setProperty("webdriver.gecko.driver", "C:\\Users\\SMR\\.eclipse\\Trainig_facebook\\Drivers\\geckodriver.exe");
    driver=new FirefoxDriver();
    driver.navigate().to(wbsite);
    driver.manage().window().maximize();
  }else {
	System.out.println("Please check name");  
  }
  }
  
  @AfterClass
  public void afterClass() {
  }

}
