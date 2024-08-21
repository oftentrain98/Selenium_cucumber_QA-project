Feature: VerKo Professional Validations

  As a user of the verko website
  I want Open Profressional and perform Validations

  Background:
    Given Launching the Application

	@ProfessionalValidations @AllValidations
  Scenario: Successful Validation of Professional Page
    Given Click On the Professional Option from the Landing Page
    When Professional Landing Page Validation
    And Check for the Location button
    And Check the Entries available in the Dropdown
    And Remove the Selected Entry from the dropdown list
    And Check for the Service Provider button
    And Check the Entries available in the Dropdown 
    And Remove the Selected Entry from the dropdown list
   	And Check for the Material Supplier button
    And Check the Entries available in the Dropdown 
    And Remove the Selected Entry from the dropdown list
    And Click on the Visit Page button
    And Jump into the Profile Window
    And Click on the Follow button button 
    And Close the PopUp Window - Opened
    And Click on the Message button button 
    And Close the PopUp Window - Opened
    And Open the Post in the Professional Page 
    And Do like and DisLike the Post 
    And Close the PopUp Window - Opened
    Then Close the Post Selected
    And Open the Discussion Tab Available
 
