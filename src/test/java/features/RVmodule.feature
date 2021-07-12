Feature: Verify RV module offline report can be successfully synced to online database

  @RVOfflineReportSync
  Scenario Outline: complete RV report offline and see if it displays in online listing
    Given click Analysis
    Then click Remote Verification module
    And enter text "<ReportTitle>"
    Then click ChooseFile and upload photo_three
    When enter text "<Detail>" for description_four
    And click InPerson tab_five
    Given click I certify_six
    And enter VNametext "<VerifierName>"_six
    And enter VTitletext "<VerifierTitle>"_six
    Then click save button_seven

    Examples: 
      | ReportTitle       | Detail          | VerifierName | VerifierTitle |
      | RVofflineAutoTest | work evaluation | MarryAnne    | Site Manager  |
