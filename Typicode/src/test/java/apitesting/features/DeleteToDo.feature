Feature: Get todos

  @apitest
  Scenario: Get all todos
    Given I have an endpoint
    When I send a delete todo request with id 203
    Then The todo is successfully deleted
