Feature: UserManagement

  Scenario: User Creation
    Given User with username "xy123" and password "12345678" is logged in
    When User creates a new user with id "1234" and name
    Then user should se the user with username is created

    Scenario: User Delete
      Given User with username "xy123" and password "12345678" is logged in
      When  User deletes user with username "delete.me"
      Then User should be deleted

      Scenario: User update
        Given User with username "xy123" and password "12345678" is logged in
        When User updates user with username "update.me"
        Then user should be deleted