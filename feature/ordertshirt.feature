Feature: Launch Application

    Scenario Outline: Order t-shirt and verify in Order History
      Given I loggedIn into application with email address as "<username>" and password as "<password>"
      When  I go to T-shirt page and add a T-shirt into cart
      And   I place order by doing payment
      Then  i can see order in order History
      Examples:
      |username            |password|
      |puneet8085@gmail.com|Test123@|
