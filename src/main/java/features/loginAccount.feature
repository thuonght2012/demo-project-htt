Feature: Login page

   

    Scenario Outline: Login page
          Given I open page at website <website>
          When I click on login customer button
          And I choose my username to login as <username>
          Then I click submit Login

    Examples:
    |website                       |username|
    |http://www.way2automation.com/angularjs-protractor/banking/#/login|Harry Potter |