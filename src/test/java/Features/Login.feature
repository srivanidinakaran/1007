
@tag
Feature: DropDown Select
    
   

  @tag1
  Scenario Outline: Login browser navigate to Dropdown 
    Given Open the Browser
   And Enter the url "http://the-internet.herokuapp.com/"
    When Click the DropDown
   When Select Option1 option1 From the DropDown "<OPTION1>"
   When Select Option2 option2 From the DropDown "<OPTION2>"
   And  navigate back using the browser back button
   Then I select Checkboxes from the dropdown

    Examples: 
     | OPTION1 |  | OPTION2 |
     | Option 1 |  | Option 2 |
     
      @tag2
      Scenario: Upload a file and verify successful upload
    Given I am on the-internet.herokuapp.com
    When I click on File Upload
    And I upload a file
    Then I should see the file uploaded successfully 
