@smoke
Feature:Youtube Search Task

  Scenario:Test Case/Scenario 1

    Given navigate to https://www.youtube.com/
    When  search by 'Selenium Tutorial' Keyword
    And   click on filters button
    Then  click on Video under the Type tab
    And   get the title of the third video in results
    And   click the third video
    And   assert that the video title in step 5 is the same title in step 6

  Scenario:Test Case/Scenario 2 ------->Same as test case 1 but change the keyword to 'Test Automation Tutorial'
    Given navigate to https://www.youtube.com/
    When  search by 'Test Automation Tutorial' Keyword
    And   click on filters button
    Then  click on Video under the Type tab
    And   get the title of the third video in results
    And   click the third video
    And   assert that the video title in step 5 is the same title in step 6

    Scenario:Test Case/Scenario 3 ------->Same as test case 1 but choose the 10th video in result
      Given navigate to https://www.youtube.com/
      When  search by 'Selenium Tutorial' Keyword
      And   click on filters button
      Then  click on Video under the Type tab
      And   get the title of the 10 th video in results
      And   click the third video
      And   assert that the video title in step 5 is the same title in step 6 Scenario3