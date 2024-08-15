Feature: Login


  Scenario Outline: I want to login to the nop commerce system

    Given I navigate to the site
    Then I click login
    Then I capture "<email>" and "<password>"
    Then I click on computers tab
    Then I click on desktops tab
    Then I add all desktops to cart

    Examples:
      |email  |password|
      |testing@gmail.com|Flash22|