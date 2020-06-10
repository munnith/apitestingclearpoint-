Feature: Post todos

  @apitest
  Scenario: Post a single todo
    Given I have an endpoint
    When I post a todo request with id 203
    Then The todo is successfully posted