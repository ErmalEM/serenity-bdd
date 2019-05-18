Feature: PracticeManagement

  Scenario Practice creations
    Given User with username "xyz123" and password "12345678" is logged in
    When User creates a new practice with date "18.05.19" and name "new.practice"
    Then user should se the practice with name is created

  Scenario: Practice Delete
    Given User with username "xyz123" and password "12345678" is logged in
    When  User deletes practice with name "delete.me" and date "18.05.19"
    Then Practice should be deleted


  Scenario: Practice update
    Given User with username "xyz123" and password "12345678" is logged in
    When  User updates practice with name "update.me" and date "18.05.19"
    Then Practice should be updated