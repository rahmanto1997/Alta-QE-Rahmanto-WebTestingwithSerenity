Feature: Login
  As a Bookstore Web API
  I want to see my timeline
  So that I can see bookstore

  @ReadBook
  Scenario: Read Book Success
    Given I am succes login
    When I read books in the bookstore
    Then I am taken to the website of books

  @CreateListBook
  Scenario: Create List Book Success
    Given I am success login
    When I am create list book
    Then I am success add book

  @DeleteListBook
  Scenario: Delete List Book Success
    Given I am success login in the bookstore
    When I am delete book
    Then I am success delete book