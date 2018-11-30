import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Win10 Setups\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://www.facebook.com");
		d.manage().window().maximize();
		
		
	}

}
