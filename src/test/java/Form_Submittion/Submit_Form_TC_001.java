package Form_Submittion;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Submit_Form_TC_001 {
	
	
	public static WebDriver driver;
	
	
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\Tudip_Assignment_001\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

}
