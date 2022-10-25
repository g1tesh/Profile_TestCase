package Form_Submittion;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Submit_Form_POM extends Submit_Form_TC_001 {
	
	public Submit_Form_POM()
	{
		PageFactory.initElements(driver,this);
		
	}
	
	//PageFactory
	@FindBy(id = "RESULT_TextField-1")
	WebElement firstname;
	
	@FindBy(id = "RESULT_TextField-2")
	WebElement lastname;
	
	@FindBy(id = "RESULT_TextField-3")
	WebElement phoneno;
	
	@FindBy(id = "RESULT_TextField-4")
	WebElement country;
	
	@FindBy(xpath = "//input[@name = 'RESULT_TextField-5']")
	WebElement city;
	
	
	@FindBy(xpath = "//input[@name = 'RESULT_TextField-6']")
	WebElement email;
	
	@FindBy(xpath = "//input[@value= 'Radio-0']")
	WebElement gender;
	
	//Actions Class
	
	@FindBy(xpath = "//input[@value= 'CheckBox-0']")
	WebElement mondaycheckbox;
	
	@FindBy(id = "RESULT_RadioButton-9")
	WebElement dropdown;
	
	@FindBy(xpath = "//input[@type = 'file']")
	WebElement uploadfile;
	
	
	
	public void EnterFirstName(String FirstName)
	{
		firstname.sendKeys(FirstName);;
	}
	
	public void EnterLastName(String LastName)
	{
		lastname.sendKeys(LastName);
	}
	
	public void EnterNo()
	{
		phoneno.sendKeys("1234567890");;
	}
	
	public void EnterCountry_City(String Country, String City)
	{
		country.sendKeys(Country);
		city.sendKeys(City);
	}
	
	public void EnterEmail(String Email) throws InterruptedException
	{
		email.sendKeys(Email);
	}
	
	public void SelectGender()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", gender);
		
	}
	
	public void CheckBox()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", mondaycheckbox);
		
	}
	
	public void SelectTime()
	{
		Select select = new Select(dropdown);
		select.selectByVisibleText("Morning");
	}
	
	public void UploadFile(String FilePath)
	{
		uploadfile.sendKeys(FilePath);
	}
	
}
