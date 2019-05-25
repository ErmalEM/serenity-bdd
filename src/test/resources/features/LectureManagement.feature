Feature: LectureManagement

  Scenario Lecture creations
    Given User with username "xyz123" and password "12345678" is logged in
    When User creates a new lecture with id "1234" and name
    Then user should se the lecture with name is created

  Scenario: Lecture Delete
    Given User with username "xyz123" and password "12345678" is logged in
    When  User deletes lecture with name "delete.me"
    Then Lecture should be deleted


  Scenario: Lecture update
    Given User with username "xyz123" and password "12345678" is logged in
    When  User updates lecture with name "update.me"
    Then Lecture should be updated