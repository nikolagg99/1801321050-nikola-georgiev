Feature: Write comments

  Scenario: Writing empty comment 
    Given The user open the writing comments form
    When Writing comment ""
    And Clicks add comment button
    Then Recieve a message "Can't upload empty comments"
    
  Scenario: Writing comment
    Given The user open the writing comments form
    When Writing comment "Nice topic"
    And Clicks add comment button
    Then Recieve a message "Comment uploaded successfully"
    
  
