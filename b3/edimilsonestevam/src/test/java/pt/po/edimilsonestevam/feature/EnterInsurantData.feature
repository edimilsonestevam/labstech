Feature: Enter Insurant Data
  I want to register my insurance in the Enter Insurant Data

  @scenario-success-insurance-registered
  Scenario Outline: Insurance Registered Success
    Given I want to register my insurance in the Enter Insurant Data <url>
    When I fill all fields <firstName>, <lastName>, <dateBirth>, <gender>, <streetAddress>, <country>, <zipCode>, <city>, <occupation>, <hobbies>, <website>
    And I confirm insurance action
    Then the system will show <tabName> Enter Product Data tab

    Examples: 
      | url                                   | firstName | lastName   | dateBirth    | gender   | streetAddress   | country  | zipCode   | city      | occupation   | hobbies     | website               | tabName                | 
      | "sampleapp.tricentis.com/101/app.php" | "Eduarda" | "Mendonça" | "10/28/2006" | "Female" | "2236 31 St SW" | "Canada" | "T3E 2N4" | "Calgary" | "Unemployed" | "Skydiving" | "www.duda-alegria.ca" | "Enter Product Data 6" |