Feature: Verifying the adactin functionalities with types of rooms

  Scenario: Verifying adactin login functionalities with types of rooms
    Given User is on the adactin page
    When User should enter
      | username        | password  |
      | priyadharshiniM | priyasuji |
      | priyadharshiniM | priyasuji |
      | priyadharshiniM | priyasuji |
      | priyadharshiniM | priyasuji |
    And User should click the login button
    Then user should select the location as
      | location | hotels      | roomType | numberOfRooms | adultsPerRoom | childrenPerRoom |
      | Sydney   | Hotel Creek | Deluxe   | 1 - One       | 1 - One       | 1 - One         |
      | Sydney   | Hotel Creek | Deluxe   | 1 - One       | 1 - One       | 1 - One         |
      | Sydney   | Hotel Creek | Deluxe   | 1 - One       | 1 - One       | 1 - One         |
      | Sydney   | Hotel Creek | Deluxe   | 1 - One       | 1 - One       | 1 - One         |
    And User should click the search button
    Then User should click  the radio button
    And User should click the continue button
    Then User should enter the values as
      | FirstName | LastName  | Address | CardNo           | CardType | Month | Year | Cvv |
      | priya     | dhasrhini | chennai | 7485000236510000 | VISA     | March | 2022 | 120 |
      | priya     | dhasrhini | chennai | 7485125631977451 | VISA     | March | 2022 | 120 |
      | priya     | dhasrhini | chennai | 7485125631977451 | VISA     | March | 2022 | 120 |
      | priya     | dhasrhini | chennai | 7485125631977451 | VISA     | March | 2022 | 120 |
    And user should click Book Now
    Then User should print the order id
