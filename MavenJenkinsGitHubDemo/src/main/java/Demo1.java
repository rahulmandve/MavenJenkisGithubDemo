import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo1 {
	@Test
	public void demotest()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Win10 Setups\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://www.facebook.com");
		d.manage().window().maximize();
		
		
	}

}
