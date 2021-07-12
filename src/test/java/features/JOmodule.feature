Feature: Job Observation module functionality

  @JOSPVMitigation
  Scenario Outline: verify JO report thoroughly and verify if data entry is correct on html report
    Given User clicks on Analysis option
    And User should be landed to Analysis sub menu by verifying submenu text "<AnalysisMenu>"
    Then User clicks on Job Observation Analysis option
    Then User verifies subtitle text Record job observation details…to the job observation"<jobobservationdetails>"
    And User enter valid name for Report Title "<strreportTitle>"
    Given User enters valid name for Organisation"<orgName>"
    When User enters valid name for Department"<departName>"
    And User clicks on Calender and select valid Date
    And User enters valid name for Observer "<jobObserver>"
    When User enters valid precise Location "<jobLocation>"
    Then User enters valid detailed description for Job observed "<jobObserv>"
    When User clicks on Supporting file details button
    Then User enters valid Title "<Title>"
    When User enters valid Description "<Description>"
    Then User clicks on Choose file and select valid file to upload
    When User clicks on first file rotate button
    And User clicks on attach another file button
    Then User verifies supporting file two text display
    And User enters valid second Title "<TitleTwo>"
    And User enters valid second Description "<DescriptionTwo>"
    And User clicks on Choose file and select valid Second file to upload
    Then User clicks on next button
    #1.2
    Then User select valid data from observation type "<observationtype>" and category dropdown "<category>"
    Then I select the checkboxes for "<observationtype>" and "<cagtegoryText>"
    Then User clicks on next button two
    #1.3
    And I provide details for categories for "<observationtype>" and "<cagtegoryText>"
    Then User clicks on next button two
    #1.4
    Then User clicks Proceed to common analysis button
    And User validates pdf file entry for main label "Job Observation 1: <jobObserv>" entry value "<orgName>"
    And User validates pdf file entry for main label "Job Observation 1: <jobObserv>" entry value "<departName>"
    And User validates pdf file entry for main label "Job Observation 1: <jobObserv>" entry value "<jobObserver>"
    And User validates pdf file entry for main label "Job Observation 1: <jobObserv>" entry value "<jobLocation>"
    And User validates pdf file entry for main label "Job Observation 1: <jobObserv>" entry value "<jobObserv>"
    And User validates pdf file entry for main label "Job Observation 1: <jobObserv>" entry value "SPV"
    And User validates pdf file entry for main label "Job Observation 1: <jobObserv>" entry value "<cagtegoryText>"
    And User validates observed factors and their characteristics in pdf file entry for main label "Job Observation 1: <jobObserv>" for "<observationtype>" and "<cagtegoryText>"

    Examples: 
      | AnalysisMenu            | jobobservationdetails                                                                                 | strreportTitle       | orgName    | departName | jobObserver | jobLocation | jobObserv   | Title   | Description    | TitleTwo | DescriptionTwo         | observationtype | category | cagtegoryText |
      # | detect & prevent errors | [1.1] Record job observation details and description. Upload photos relevant to this job observation. | SPV_autoReportInJuly   | ABCCompany | Technology | Dr. Tom     | HK          | fieldsiteWC | maskoff | maskoff hazard | NoGloves | Health&Safety Concerns | SPV Mitigation  | equi			| 	Equipment		|
      #| detect & prevent errors | [1.1] Record job observation details and description. Upload photos relevant to this job observation. | SPV_autoReportInJuly    | ABCCompany | Technology | Dr. Tom     | HK          | fieldsiteWC | maskoff | maskoff hazard | NoGloves | Health&Safety Concerns | SPV Mitigation  | proc 		|		Procedure 	|
     # | detect & prevent errors | [1.1] Record job observation details and description. Upload photos relevant to this job observation. | SPV_autoReportInJuly | ABCCompany | Technology | Dr. Tom     | HK          | fieldsiteWC | maskoff | maskoff hazard | NoGloves | Health&Safety Concerns | SPV Mitigation  | inju     | Injury        |

  @JOErrorInducingCondition
  Scenario Outline: verify JO report thoroughly and verify if data entry is correct on html report
    Given User clicks on Analysis option
    And User should be landed to Analysis sub menu by verifying submenu text "<AnalysisMenu>"
    Then User clicks on Job Observation Analysis option
    Then User verifies subtitle text Record job observation details…to the job observation"<jobobservationdetails>"
    And User enter valid name for Report Title "<strreportTitle>"
    Given User enters valid name for Organisation"<orgName>"
    When User enters valid name for Department"<departName>"
    And User clicks on Calender and select valid Date
    And User enters valid name for Observer "<jobObserver>"
    When User enters valid precise Location "<jobLocation>"
    Then User enters valid detailed description for Job observed "<jobObserv>"
    When User clicks on Supporting file details button
    Then User enters valid Title "<Title>"
    When User enters valid Description "<Description>"
    Then User clicks on Choose file and select valid file to upload
    When User clicks on first file rotate button
    And User clicks on attach another file button
    Then User verifies supporting file two text display
    And User enters valid second Title "<TitleTwo>"
    And User enters valid second Description "<DescriptionTwo>"
    And User clicks on Choose file and select valid Second file to upload
    Then User clicks on next button
    #1.2
    Then User select valid data from observation type "<observationtype>" and category dropdown "<category>"
    Then I select the checkboxes for "<observationtype>" and "<cagtegoryText>"
    Then User clicks on next button two
    #1.3
    And I provide details for categories for "<observationtype>" and "<cagtegoryText>"
    Then User clicks on next button two
    #1.4
    Then User clicks Proceed to common analysis button
    And User validates pdf file entry for main label "Job Observation 1: <jobObserv>" entry value "<orgName>"
    And User validates pdf file entry for main label "Job Observation 1: <jobObserv>" entry value "<departName>"
    And User validates pdf file entry for main label "Job Observation 1: <jobObserv>" entry value "<jobObserver>"
    And User validates pdf file entry for main label "Job Observation 1: <jobObserv>" entry value "<jobLocation>"
    And User validates pdf file entry for main label "Job Observation 1: <jobObserv>" entry value "<jobObserv>"
    And User validates pdf file entry for main label "Job Observation 1: <jobObserv>" entry value "Error-inducing Condition"
    And User validates pdf file entry for main label "Job Observation 1: <jobObserv>" entry value "<cagtegoryText>"
    And User validates observed factors and their characteristics in pdf file entry for main label "Job Observation 1: <jobObserv>" for "<observationtype>" and "<cagtegoryText>"

    Examples: 
      | AnalysisMenu            | jobobservationdetails                                                                                 | strreportTitle          | orgName    | departName | jobObserver | jobLocation | jobObserv   | Title   | Description    | TitleTwo | DescriptionTwo         | observationtype          | category | cagtegoryText       |
     # | detect & prevent errors | [1.1] Record job observation details and description. Upload photos relevant to this job observation. | ErrorInConReportInJunly | ABCCompany | Technology | Dr. Tom     | HK          | fieldsiteWC | maskoff | maskoff hazard | NoGloves | Health&Safety Concerns | Error-inducing Condition | timerela | Time related        |
     # | detect & prevent errors | [1.1] Record job observation details and description. Upload photos relevant to this job observation. | ErrorInConReportInJunly | ABCCompany | Technology | Dr. Tom     | HK          | fieldsiteWC | maskoff | maskoff hazard | NoGloves | Health&Safety Concerns | Error-inducing Condition | actirela | Activity related    |
       | detect & prevent errors | [1.1] Record job observation details and description. Upload photos relevant to this job observation. | ErrorInConReportInJunly | ABCCompany | Technology | Dr. Tom     | HK          | fieldsiteWC | maskoff | maskoff hazard | NoGloves | Health&Safety Concerns | Error-inducing Condition | peoprela | People related      |
      #| detect & prevent errors | [1.1] Record job observation details and description. Upload photos relevant to this job observation. | ErrorInConReportInJunly | ABCCompany | Technology | Dr. Tom     | HK          | fieldsiteWC | maskoff | maskoff hazard | NoGloves | Health&Safety Concerns | Error-inducing Condition | envirela | Environment related |

  @JOErrorProneBehavior
  Scenario Outline: verify JO report thoroughly and verify if data entry is correct on html report
    Given User clicks on Analysis option
    And User should be landed to Analysis sub menu by verifying submenu text "<AnalysisMenu>"
    Then User clicks on Job Observation Analysis option
    Then User verifies subtitle text Record job observation details…to the job observation"<jobobservationdetails>"
    And User enter valid name for Report Title "<strreportTitle>"
    Given User enters valid name for Organisation"<orgName>"
    When User enters valid name for Department"<departName>"
    And User clicks on Calender and select valid Date
    And User enters valid name for Observer "<jobObserver>"
    When User enters valid precise Location "<jobLocation>"
    Then User enters valid detailed description for Job observed "<jobObserv>"
    When User clicks on Supporting file details button
    Then User enters valid Title "<Title>"
    When User enters valid Description "<Description>"
    Then User clicks on Choose file and select valid file to upload
    When User clicks on first file rotate button
    And User clicks on attach another file button
    Then User verifies supporting file two text display
    And User enters valid second Title "<TitleTwo>"
    And User enters valid second Description "<DescriptionTwo>"
    And User clicks on Choose file and select valid Second file to upload
    Then User clicks on next button
    #1.2
    Then User select valid data from observation type "<observationtype>" and category dropdown "<category>"
    Then I select the checkboxes for "<observationtype>" and "<cagtegoryText>"
    Then User clicks on next button two
    #1.3
    And I provide details for categories for "<observationtype>" and "<cagtegoryText>"
    Then User clicks on next button two
    #1.4
    Then User clicks Proceed to common analysis button
    And User validates pdf file entry for main label "Job Observation 1: <jobObserv>" entry value "<orgName>"
    And User validates pdf file entry for main label "Job Observation 1: <jobObserv>" entry value "<departName>"
    And User validates pdf file entry for main label "Job Observation 1: <jobObserv>" entry value "<jobObserver>"
    And User validates pdf file entry for main label "Job Observation 1: <jobObserv>" entry value "<jobLocation>"
    And User validates pdf file entry for main label "Job Observation 1: <jobObserv>" entry value "<jobObserv>"
    And User validates pdf file entry for main label "Job Observation 1: <jobObserv>" entry value "Error-prone Behavior"
    And User validates pdf file entry for main label "Job Observation 1: <jobObserv>" entry value "<cagtegoryText>"
    And User validates observed factors and their characteristics in pdf file entry for main label "Job Observation 1: <jobObserv>" for "<observationtype>" and "<cagtegoryText>"

    Examples: 
      | AnalysisMenu            | jobobservationdetails                                                                                 | strreportTitle           | orgName    | departName | jobObserver | jobLocation | jobObserv   | Title   | Description    | TitleTwo | DescriptionTwo         | observationtype      | category | cagtegoryText               |
    #  | detect & prevent errors | [1.1] Record job observation details and description. Upload photos relevant to this job observation. | ErrorPronBeReportInJunly | ABCCompany | Technology | Dr. Tom     | HK          | fieldsiteWC | maskoff | maskoff hazard | NoGloves | Health&Safety Concerns | Error-prone Behavior | intenonc | Intentional noncompliance   |
   #  | detect & prevent errors | [1.1] Record job observation details and description. Upload photos relevant to this job observation. | ErrorPronBeReportInJunly | ABCCompany | Technology | Dr. Tom     | HK          | fieldsiteWC | maskoff | maskoff hazard | NoGloves | Health&Safety Concerns | Error-prone Behavior | uninnonc | Unintentional noncompliance |
      | detect & prevent errors | [1.1] Record job observation details and description. Upload photos relevant to this job observation. | ErrorPronBeReportInJunly | ABCCompany | Technology | Dr. Tom     | HK          | fieldsiteWC | maskoff | maskoff hazard | NoGloves | Health&Safety Concerns | Error-prone Behavior | knowerro | Knowledge-based errors      |
