Feature: ClassManagement
  Scenario: Class Creation
    Given User with username "xyz123" and password "12345678" is logged in
    When User creates a new class with id "1234" and name
    Then user should se the class with name is created

  Scenario: Class Delete
    Given User with username "xyz123" and password "12345678" is logged in
    When  User deletes class with name "delete.me"
    Then Class should be deleted


  Scenario: Class Update
    Given User with username "xyz123" and password "12345678" is logged in
    When  User updates class with name "update.me"
    Then Class should be updated