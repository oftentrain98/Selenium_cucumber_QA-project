package com.qa.mystepdefs;


import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Design_Professional_PageValidations;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





public class Design_Professional_StepDefinitions {


	private  WebDriver driver;


    @Before
    public void setup(){
        driver = new ChromeDriver();
        
    }
    
    @AfterStep
	public void addScreenshot(Scenario scenario) throws IOException {
		  File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		  byte[] fileContent = FileUtils.readFileToByteArray(screenshot);
		  scenario.attach(fileContent, "image/png", "screenshot");
		
	}

    @After
    public void CloseBrowser() throws InterruptedException, IOException {
		driver.quit();
		System.out.println("Closing the Browser Window");
    }
    
    
    
    /// ********* Launch Application  -- BACKGROUND ******************	
    @Given("Launching the Application")
    public void LaunchApplication_Step() throws IOException {
        Design_Professional_PageValidations Lp = new Design_Professional_PageValidations(driver);
        Lp.LaunchApplication();

    }
    
    
  /// ********* Design Page  & Professional Page -- Scenarios ******************
    @Given("Click On the Design Option from the Landing Page")
    public void DesignOptionSelect_Step() throws InterruptedException, IOException {
    	Design_Professional_PageValidations Lp = new Design_Professional_PageValidations(driver);
    	Lp.DesignPage_Click();
    }

    
    @When("Design Landing Page Validation")
    public void DesignLandingPage_Step() throws InterruptedException, IOException {
    	Design_Professional_PageValidations Lp = new Design_Professional_PageValidations(driver);
    	Lp.DesignLandingPage();
    }
    
    @And("Design page Tag Validations")
    public void DesignPageTagValidation_Step() throws InterruptedException, IOException {
    	Design_Professional_PageValidations Lp = new Design_Professional_PageValidations(driver);
    	Lp.DesignTagsValidation();
    }
    
    @And("Open the Post in the Design Page")
    public void DesignPageEntrySelection_Step() throws InterruptedException, IOException {
    	Design_Professional_PageValidations Lp = new Design_Professional_PageValidations(driver);
    	Lp.DesignPageEntrySelection();
    }
    
    @And("Do like and DisLike the Post")
    public void DesignPageEntryLikeAndDislike_Step() throws InterruptedException, IOException {
    	Design_Professional_PageValidations Lp = new Design_Professional_PageValidations(driver);
    	Lp.DesignPageEntrySelection_LikeUnLike();
    	// Lp.DesignPageEntrySelection_LikeCloseWindow();
    }
    
    @And("Close the PopUp Window - Opened")
    public void DesignPageEntryLikeAndDislike_PopUpWindowClose_Step() throws InterruptedException, IOException {
    	Design_Professional_PageValidations Lp = new Design_Professional_PageValidations(driver);
    	Lp.DesignPageEntrySelection_LikeCloseWindow();
    }
    
    @Then("Close the Post Selected")
    public void DesignPageClosePost_Step() throws InterruptedException, IOException {
    	Design_Professional_PageValidations Lp = new Design_Professional_PageValidations(driver);
    	Lp.DesignPage_EntryWindow_Close();
    }
    
    
    
    // Professional 
    @Given("Click On the Professional Option from the Landing Page")
    public void ProfessionalOptionSelect_Step() throws InterruptedException, IOException {
    	Design_Professional_PageValidations Lp = new Design_Professional_PageValidations(driver);
    	Lp.Professional_Click();
    }

    
    @When("Professional Landing Page Validation")
    public void ProfessionalLandingPage_Step() throws InterruptedException, IOException {
    	Design_Professional_PageValidations Lp = new Design_Professional_PageValidations(driver);
    	Lp.ProfessionalLandingPage();
    }
    
    @And("Check for the Location button")
    public void ProfessionalPage_LocationBtn_Step() throws InterruptedException, IOException {
    	Design_Professional_PageValidations Lp = new Design_Professional_PageValidations(driver);
    	Lp.ProfessionalLocationSelection();
    }
    
    @And("Check the Entries available in the Dropdown")
    public void ProfessionalPage_SearchEntrySelection_Step() throws InterruptedException, IOException {
    	Design_Professional_PageValidations Lp = new Design_Professional_PageValidations(driver);
    	Lp.LocationInput_Validation();
    }
    
    @And("Remove the Selected Entry from the dropdown list")
    public void ProfessionalPage_SearchRemoveEntrySelection_Step() throws InterruptedException, IOException {
    	Design_Professional_PageValidations Lp = new Design_Professional_PageValidations(driver);
    	Lp.RemoveInput_Validation();
    }
    
    
    @And("Check for the Service Provider button")
    public void ProfessionalPage_ServiceProviderBtn_Step() throws InterruptedException, IOException {
    	Design_Professional_PageValidations Lp = new Design_Professional_PageValidations(driver);
    	Lp.ProfessionalServiceProvider_Selection();
    }
    
    @And("Check for the Material Supplier button")
    public void ProfessionalPage_MaterialSupplierBtn_Step() throws InterruptedException, IOException {
    	Design_Professional_PageValidations Lp = new Design_Professional_PageValidations(driver);
    	Lp.ProfessionalMaterialSupplier_Selection();
    }
    
    @And("Click on the Visit Page button")
    public void ProfessionalPage_VisitProfile_Step() throws InterruptedException, IOException {
    	Design_Professional_PageValidations Lp = new Design_Professional_PageValidations(driver);
    	Lp.ProfessionalPage_VisitPage();
    }
    
    @And("Jump into the Profile Window")
    public void ProfessionalPage_Jump_VisitProfile_Step() throws InterruptedException, IOException {
    	Design_Professional_PageValidations Lp = new Design_Professional_PageValidations(driver);
    	Lp.windowhandling();
    }
    
    @And("Click on the Follow button button")
    public void ProfessionalPage_ProfilePage_FollowBtn_Step() throws InterruptedException, IOException {
    	Design_Professional_PageValidations Lp = new Design_Professional_PageValidations(driver);
    	Lp.ProfessionalPage_VisitProfile_Follow();
    }
    
    @And("Click on the Message button button")
    public void ProfessionalPage_ProfilePage_MessageBtn_Step() throws InterruptedException, IOException {
    	Design_Professional_PageValidations Lp = new Design_Professional_PageValidations(driver);
    	Lp.ProfessionalPage_VisitProfile_Message();
    }
    
    @And("Open the Post in the Professional Page")
    public void ProfessionalPage_ProfilePage_OpenPost_Step() throws InterruptedException, IOException {
    	Design_Professional_PageValidations Lp = new Design_Professional_PageValidations(driver);
    	Lp.DesignPageEntrySelection();
    }
    
    @And("Open the Discussion Tab Available")
    public void ProfessionalPage_ProfilePage_OPenDiscussion_Step() throws InterruptedException, IOException {
    	Design_Professional_PageValidations Lp = new Design_Professional_PageValidations(driver);
    	Lp.ProfessionalDiscussionTab();
    }
    
    
}

