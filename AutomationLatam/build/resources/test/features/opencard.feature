#Author: Luis Petro

@stories
Feature: I as a OpenCard user
  I want to be able to do operations on products
  to manage them

  Background:
    Given than user enters the website
     And  enter valid access data
          | user | password |
          | demo |    demo  |

@Scenario1
  Scenario Outline:  verify that product cannot be edited
    Given than user navigate to the product edit screen
          | productName |
          |<productName>|
    When  Update product data
          | newProductName |
          |<newProductName>|
    Then  verify that you do not have permissions
          | errorMessage |
          |<errorMessage>|

    Examples:
      | productName | newProductName | errorMessage|
      | Apple       |  Ipad          |  Warning: You do not have permission to modify products!|

@Scenario2
    Scenario Outline: Create new product

      Given than user navigate to the new product screen
      When  fill in the product data
        | productName | metaTagTitle | model |
        |<productName>|<metaTagTitle>|<model>|
      Then  verify that you do not have permissions
        | errorMessage |
        |<errorMessage>|

      Examples:
        | productName | metaTagTitle | model | errorMessage |
        | CamaraWeb   | Logitech     | E30   |Warning: You do not have permission to modify products!|