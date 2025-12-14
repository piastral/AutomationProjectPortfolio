




Feature: Login Test


  Scenario: To Test login functionality with valid data 
    Given User is on login page 
    When User enter valid username as  "<username>" and password as "<password>"
    And click on login button
    Then User should land on homepage 
     
   

  
   Examples: 
   |username|password|
   |Admin   |admin123|
   |abc     |abc123|
   |xyz     |xyz123|
  