Feature: Launch

Scenario Outline: I want to register my profile

  Given I launch my website
  Then I capture my "<firstname>" and "<lastname>"
  Then I capture my "<email>" address
  And I create my "<password>" and "<ConfirmPassword>"
  Then I click on register
  And I logout

  Examples:
    |firstname  |lastname|email|password|ConfirmPassword|
    |Matshediso |Tshidi|testing@gmail.com|Flash22|Flash22|
