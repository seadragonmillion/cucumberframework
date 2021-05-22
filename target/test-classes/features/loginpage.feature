Feature: Login Functionality


  @Login
  Scenario Outline: To Test Login
    Given User is on homepage
    And User verify Title of the page
   
      
      
    @Admin
  Scenario Outline: enter System UserName and click search button 
    Given User clicks admin tab
    When User clicks user management tab
    And User enters system username "<systemusername>"
    When User select User Role Dropdown "<Dropdownvalue>"
    And User click and enter "<EmployeeName>"
    Then User clicks search button   
    Then User confirm employee status show Enable text 
    

    Examples: 
      | systemusername  | EmployeeName | Dropdownvalue |
      | admin           | Paul         | Admin |
      
      @Leave
  Scenario Outline: Search particular employee 
    Given User clicks on leave tab
    When User clicks on From calender 
    And User selects month and year for From Calender
    Then User clicks on any date
    And User clicks on To Calender
    Then User selects month and year for To Calender
    And User selects any date
    Then User unchecks Pending Approval checkbox
    When User enters "<EmployeeName>"
    And User checkbox SubUnit
    Then User selects "<Dropdownvalue>"
    And User clicks including past employee checkbox
    Then User clicks on search button

Examples: 
    | EmployeeName |Dropdownvalue |
    | Paul         |  Administration       |
     
