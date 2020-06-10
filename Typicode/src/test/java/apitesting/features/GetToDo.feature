Feature: Get todos

  @apitest
  Scenario: Get all todos
    Given I have an endpoint
    When I send a request for all todos
    Then I receive the list of all todos

  @apitest
  Scenario: Get a single todo
    Given I have an endpoint
    When I send a todo request with id 25
    Then I receive the specific todo