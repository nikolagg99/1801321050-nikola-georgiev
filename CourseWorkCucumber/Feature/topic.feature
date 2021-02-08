Feature: Begin new topic 

  Scenario: Begin new topic
    Given The user open the form for creating new topic
    When Writing header of the topic "Java"
    And Writing the content of the topic "What do you think about Java?"
    And Clicks add topic button
    Then Recieves a message "Successfully added topic"
    
  Scenario: Add topic without header
    Given The user open the form for creating new topic
    When Writing the content of the topic "What do you think about Java?"
    And Clicks add topic button
    Then Recieves a message "Error. You can't add new topic without header"
    
  Scenario: Add topic without content
    Given The user open the form for creating new topic
    When Writing header of the topic "Java"
    And Clicks add topic button
    Then Recieves a message "Error. You can't add new topic without content"
    
  Scenario: Add topic without header and content
    Given The user open the form for creating new topic
    When Clicks add topic button
    Then Recieves a message "Error. You can't add new topic without any header and content"