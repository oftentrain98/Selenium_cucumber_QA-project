package pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Design_Professional_PageValidations {

    public WebDriver driver;

    // Locators
    @FindBy(xpath = "//button[text()='DESIGNS']")
	WebElement Design_Select;

	@FindBy(xpath = "//*[text()='Latest Home Design Ideas in India']")
	WebElement Design_Title;
	
	String TagsList = "//div[contains(@class,'MuiButtonBase')]//span[1]";
	
	@FindBy(xpath = "(//ul[contains(@class,'MuiImageList')]//li)[1]")
	WebElement DesignPage_EntrySelection;
	
	@FindBy(xpath = "//button[@aria-label='like']")
	WebElement DesignPage_EntrySelection_Heart;
	
	@FindBy(xpath = "//h2[contains(@class,'MuiTypography')]//button[@aria-label='close']")
	WebElement DesignPage_EntrySelection_Heart_CloseWindow;
	
	@FindBy(xpath = "(//button[@aria-label='close'])[2]")
	WebElement DesignPage_EntrySelection_Close;
	
			
	
	@FindBy(xpath = "//button[text()='PROFESSIONALS']")
	WebElement Professional_Select;
	
	@FindBy(xpath = "//*[text()='Service Providers & Suppliers Near you']")
	WebElement Professional_Title;
	
	@FindBy(xpath = "//button[text()='Location']")
	WebElement Professional_Location;
	
	String InputEntries = "//input[@aria-label='search google maps']// following::*[contains(@class,'MuiButton-root')]";
	
	@FindBy(xpath = "//button[text()='Service Provider']")
	WebElement Professional_ServiceProvider;
	
	@FindBy(xpath = "//button[text()='Material Supplier']")
	WebElement Professional_MaterialSuplier;
	
	@FindBy(xpath = "(//button[text()='Visit Profile'])[1]")
	WebElement Professional_VisitProfile;
	
	@FindBy(xpath = "(//p[contains(text(),'Connect with')]// following :: button)[1]")
	WebElement Professional_FollowButton;
	
	@FindBy(xpath = "(//p[contains(text(),'Connect with')]// following :: button)[2]")
	WebElement Professional_MessageButton;
	
	@FindBy(xpath = "//button[contains(@class,'MuiIconButton')][1]")
	WebElement Professional_RemoveFilter;
	
	@FindBy(xpath = "//button[text()='Discussions']")
	WebElement Professional_DiscussionTab;
	
    Properties props = new Properties();
	static String propsFilepath = "/src/test/resources/Config.properties";
    FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + propsFilepath);
    
    
    // Constructor
    public Design_Professional_PageValidations(WebDriver driver)  throws IOException
    {
    	this.driver = driver;
    	props.load(fis);
        PageFactory.initElements(driver, this);
        
    }

    // Methods
    
    public void LaunchApplication() throws IOException
	{
	   driver.manage().window().maximize();
	   driver.get(props.getProperty("URL")); 
	   try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   //driver.navigate().refresh();
	}

    public void DesignPage_Click() throws InterruptedException, IOException 
    {
    	if(Design_Select.isDisplayed())
    	{
    		Design_Select.click();
    		System.out.println("Design Option Clicked");
		}
		else
		{
			System.out.println("Design Option NOT Available");
		}
    }
    
    public void DesignLandingPage()
    {
    	if(Design_Title.isDisplayed())
    	{
    		System.out.println("Design Option Clicked and Landing Title Available --> "+Design_Title.getText());
		}
		else
		{
			System.out.println("Design Landing Page NOT Available");
		}
    }

   
    public void DesignTagsValidation()
    {	
    	List<WebElement> TaggsList = driver.findElements(By.xpath(TagsList));
    	TaggsList.size();
    	
    	System.out.println("We have totally --> " +TaggsList.size() + " <---- Tags available");
    	System.out.println("Please find below the available Tags");
    	
    	for(int i=0;i<TaggsList.size();i++)
    	{
    		TaggsList.get(i).getText();
    		int k = i+1;
    		System.out.println("Tag --> "+k+" -- "+TaggsList.get(i).getText());
    	}
    	
    	
    }
    
	public void DesignPageEntrySelection() throws InterruptedException, IOException 
    {
    	if(DesignPage_EntrySelection.isDisplayed())
    	{
    		DesignPage_EntrySelection.click();
    		Thread.sleep(2000);
    		System.out.println("Design Entry Opened");
		}
		else
		{
			System.out.println("Design Entry NOT Opened");
		}
    }
    
    public void DesignPageEntrySelection_LikeUnLike() throws InterruptedException, IOException 
    {
    	if(DesignPage_EntrySelection_Heart.isDisplayed())
    	{
    		DesignPage_EntrySelection_Heart.click();
    		System.out.println("Design Entry - Heart Selection");
		}
		else
		{
			System.out.println("Design Entry - Heart Selection NOT Opened");
		}
    }
    
    public void DesignPageEntrySelection_LikeCloseWindow() throws InterruptedException, IOException 
    {
    	if(DesignPage_EntrySelection_Heart_CloseWindow.isDisplayed())
    	{
    		DesignPage_EntrySelection_Heart_CloseWindow.click();
    		Thread.sleep(2000);
    		System.out.println("Design Entry - Closing the PopUp Window");
		}
		else
		{
			System.out.println("Design Entry - PopUp Window NOT Closed");
		}
    }
    
    public void DesignPage_EntryWindow_Close() throws InterruptedException, IOException 
    {
    	if(DesignPage_EntrySelection_Close.isDisplayed())
    	{
    		DesignPage_EntrySelection_Close.click();
    		Thread.sleep(2000);
    		System.out.println("Design Post Entry - Close");
		}
		else
		{
			System.out.println("Design Post Entry - Close - NOT performed");
		}
    }
    
    
    
    // Professional 
    public void Professional_Click() throws InterruptedException, IOException 
    {
    	if(Professional_Select.isDisplayed())
    	{
    		Professional_Select.click();
    		Thread.sleep(2000);
    		System.out.println("Professional Option Clicked");
		}
		else
		{
			System.out.println("Professional Option NOT Available");
		}
    }
    
    public void ProfessionalLandingPage()
    {
    	if(Professional_Title.isDisplayed())
    	{
    		System.out.println("Professional Option Clicked and Landing Title Available --> "+Professional_Title.getText());
		}
		else
		{
			System.out.println("Professional Landing Page NOT Available");
		}
    }
    
    public void ProfessionalLocationSelection()
    {
    	if(Professional_Location.isDisplayed())
    	{
    		Professional_Location.click();
    		System.out.println("Professional Location Option is available and Clicked");
		}
		else
		{
			System.out.println("Professional Location Option NOT Available");
		}
    }
    
    public void LocationInput_Validation() throws InterruptedException
    {	
    	Thread.sleep(2000);
    	List<WebElement> TaggsList = driver.findElements(By.xpath(InputEntries));
    	TaggsList.size();
    	
    	System.out.println("We have totally --> " +TaggsList.size() + " <---- Entries available");
    	System.out.println("Please find below the available Entries");
    	
    	for(int i=0;i<TaggsList.size();i++)
    	{
    		TaggsList.get(i).getText();
    		int k = i+1;
    		System.out.println("Entries --> "+k+" -- "+TaggsList.get(i).getText());
    	}
    	TaggsList.get(0).click();
    	Thread.sleep(2000);
    }
    
    public void RemoveInput_Validation() throws InterruptedException
    {	
    	Professional_RemoveFilter.click();
    	Thread.sleep(2000);
    }
    
    public void ProfessionalServiceProvider_Selection() throws InterruptedException
    {
    	if(Professional_ServiceProvider.isDisplayed())
    	{
    		Professional_ServiceProvider.click();
    		Thread.sleep(2000);
    		System.out.println("Professional ServiceProvider Option is available and Clicked");
		}
		else
		{
			System.out.println("Professional ServiceProvider Option NOT Available");
		}
    }
    
    public void ProfessionalMaterialSupplier_Selection()
    {
    	if(Professional_MaterialSuplier.isDisplayed())
    	{
    		Professional_MaterialSuplier.click();
    		System.out.println("Professional MaterialSuplier Option is available and Clicked");
		}
		else
		{
			System.out.println("Professional MaterialSuplier Option NOT Available");
		}
    }
    
    
    public void ProfessionalPage_VisitPage() throws InterruptedException, IOException 
    {
    	if(Professional_VisitProfile.isDisplayed())
    	{
    		Professional_VisitProfile.click();
    		System.out.println("Professional VisitProfile Entry Opened");
		}
		else
		{
			System.out.println("Professional VisitProfile Entry NOT Opened");
		}
    }
    
    
    public void ProfessionalPage_VisitProfile_Follow() throws InterruptedException, IOException 
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p[contains(text(),'Connect with')]// following :: button)[1]")));
    	if(Professional_FollowButton.isDisplayed())
    	{
    		Professional_FollowButton.click();
    		Thread.sleep(2000);
    		System.out.println("Professional VisitProfile FollowButton Entry Opened");
		}
		else
		{
			System.out.println("Professional VisitProfile FollowButton Entry NOT Opened");
		}
    }
    
    public void ProfessionalPage_VisitProfile_Message() throws InterruptedException, IOException 
    {
    	if(Professional_MessageButton.isDisplayed())
    	{
    		Professional_MessageButton.click();
    		Thread.sleep(2000);
    		System.out.println("Professional VisitProfile Message Button Entry Opened");
		}
		else
		{
			System.out.println("Professional VisitProfile Message Button NOT Opened");
		}
    }
    
    public void ProfessionalDiscussionTab() throws InterruptedException, IOException 
    {
    	if(Professional_DiscussionTab.isDisplayed())
    	{
    		Professional_DiscussionTab.click();
    		Thread.sleep(2000);
    		System.out.println("Professional Discussion Tab Selected ");
		}
		else
		{
			System.out.println("Professional Discussion Tab NOT Opened");
		}
    }
    
    
    
    
    public void windowhandling() throws InterruptedException
    {
    	// String ParentWindow = driver.getWindowHandle();
	 	String LoginWindow = null;
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		while(it.hasNext())
		{
			LoginWindow = it.next();
		}
		driver.switchTo().window(LoginWindow);
		Thread.sleep(2000);
		// driver.switchTo().window(ParentWindow);
    }
    
    
    
}
