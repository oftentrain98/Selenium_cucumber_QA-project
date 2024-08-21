Feature: VerKo Design Validations

  As a user of the verko website
  I want Open Design Page and perform Validations

  Background:
    Given Launching the Application

	@DesignValidations @AllValidations
  Scenario: Successful Validation of Design Page
    Given Click On the Design Option from the Landing Page
    When Design Landing Page Validation
    And Design page Tag Validations
    And Open the Post in the Design Page 
    And Do like and DisLike the Post 
    And Close the PopUp Window - Opened
    Then Close the Post Selected
