Feature: Verify Course Search Feature

  Scenario: Verify Course Search Functionality 
    Given user open error free website
    Then verify homepage is displayed
    When user click on Contact Us link
    Then verify Contact Us Page is displayed
    When user search with keyword "Job Observation" in search for error free course field
    Then verify search results are displayed with link "Job Observation Analysis"
    When user click on link "Job Observation Analysis"
    Then verify Job Observation Analysis page is displayed
    And verify Job Observation Analysis page has text "job observations are performance-based"
