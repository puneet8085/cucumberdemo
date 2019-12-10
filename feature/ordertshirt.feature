Feature: Launch Application

    Scenario: Order t-shirt and verify in Order History
      Given I loggedIn into application with email address as "puneet8085@gmail.com" and password as "Test123@"
      When  I go to T-shirt page and add a T-shirt into cart
      And   I place order by doing payment
      Then  i can see order in order History

