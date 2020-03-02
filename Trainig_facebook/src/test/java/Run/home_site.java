package Run;

import org.testng.annotations.Test;

import common.Browsers;
import compages.newhome;


public class home_site extends Browsers {
  @Test
  public void f() {
	  
	  newhome h=new newhome(driver);
	  h.Emailfielf("yeasmin@gmail.com");
	  h.psswardfield("12345");
	  h.loginfield();
	  driver.navigate().back();
  }
}
