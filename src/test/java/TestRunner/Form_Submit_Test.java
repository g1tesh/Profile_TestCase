package TestRunner;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Form_Submittion.Submit_Form_POM;
import Form_Submittion.Submit_Form_TC_001;

public class Form_Submit_Test extends Submit_Form_TC_001 {
	
	
	Submit_Form_TC_001 sf;
	Submit_Form_POM sfp;
	
	
	@BeforeMethod
	public void prescript() throws InterruptedException
	{
		sf = new Submit_Form_TC_001();
		sf.setup();
		sfp = new Submit_Form_POM();
		
		sfp.EnterFirstName("Gitesh");
		sfp.EnterLastName("Patil");
		sfp.EnterNo();
		sfp.EnterCountry_City("India", "Pune");
		sfp.EnterEmail("xyz@gmail.com");
		sfp.SelectGender();
		sfp.CheckBox();
		sfp.SelectTime();
		sfp.UploadFile("D:\\Workspace\\Tudip_Assignment_001\\TestData\\signin.png");

		
	}
	@Test
	public void ChangeProfile()
	{
		String successText = driver.findElement(By.id("content")).getText();
		
		Assert.assertEquals(successText, "The result storage capacity has been reached for this form. Your result was not created. Please contact the form owner.");
	}
	
	@AfterMethod
	public void TearDown()
	{
		System.out.println("Quiting Driver");
		driver.quit();
	}
	

}
