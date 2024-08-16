Feature: Test Sample form technology

  Scenario: To validate the Form functionality
    Given Open browser
    And User is in form page
    When Enter "<firstname>" and "<lastname>" and "<email>" and "<contactnumber>" and "<message>"
    And User click on submit
    And I validate the assertion
    Then User switch to alert
    And click on ok

    Examples: 
      | firstname  | lastname | email 				 |contactnumber | message  |
      | Abhi 			 | sek 			| abcd@gmail.com | 9785648466 	| Hii Buddy|
