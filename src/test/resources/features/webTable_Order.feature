Feature:Web table user order feature


  Scenario: User should be able to place order and order seen in the web table
    Given user is already logged in and on order page
    When user selects product type "Familybea"
    And user enters quantity 2
    And user enters customer name "Sherlock Holmes"
    And user enters street "221B Baker Street"
    And user enters city "London"
    And user enters state "England"
    And user enters zipcode "50505"
    And user selects credit card type "MasterCard"
    And user enters credit card number "1111222233334444"
    And user enters expiry date "12/23"
    And user enters process order button
    Then user should see "Sherlock Holmes" in first row of the web table




  Scenario Template: User should be able to place order and order seen in the web table
    Given user is already logged in and on order page
    When user selects product type "<productType>"
    And user enters quantity <quantity>
    And user enters customer name "<customerName>"
    And user enters street "<street>"
    And user enters city "<city>"
    And user enters state "<state>"
    And user enters zipcode "<zipcode>"
    And user selects credit card type "<cardType>"
    And user enters credit card number "<cardNumber>"
    And user enters expiry date "<expDate>"
    And user enters process order button
    Then user should see "<expectedName>" in first row of the web table

  @femaleScientists
    Examples: Famous female scientists
      | productType | quantity | customerName       | street     | city   | state   | zipcode | cardType | cardNumber       | expDate | expectedName       |
      | MoneyCog    | 2        | Invalid Name       | London St. | London | England | 50505   | visa     | 1111222233334444 | 12/24   | Marie Curie        |
      | Familybea   | 3        | Rosalind Franklin  | London St. | London | England | 50505   | visa     | 1111222233334444 | 12/24   | Rosalind Franklin  |
      | Screenable  | 4        | List Meitner       | London St. | London | England | 50505   | visa     | 1111222233334444 | 12/24   | List Meitner       |
      | MoneyCog    | 5        | Chein-Shiun Wu     | London St. | London | England | 50505   | visa     | 1111222233334444 | 12/24   | Chein-Shiun Wu     |
      | MoneyCog    | 6        | Barbara McClintock | London St. | London | England | 50505   | visa     | 1111222233334444 | 12/24   | Barbara McClintock |




    @maleScientists

    Examples: Famous male scientists
      | productType | quantity | customerName    | street     | city   | state   | zipcode | cardType | cardNumber       | expDate | expectedName    |
      | MoneyCog    | 2        | Charles Darwin  | London St. | London | England | 50505   | visa     | 1111222233334444 | 12/24   | Charles Darwin  |
      | Familybea   | 3        | Albert Einstein | London St. | London | England | 50505   | visa     | 1111222233334444 | 12/24   | Albert Einstein |
      | Screenable  | 4        | Cv Raman        | London St. | London | England | 50505   | visa     | 1111222233334444 | 12/24   | Cv Raman        |
      | MoneyCog    | 5        | Galileo         | London St. | London | England | 50505   | visa     | 1111222233334444 | 12/24   | Galileo         |
      | MoneyCog    | 6        | Isac Newton     | London St. | London | England | 50505   | visa     | 1111222233334444 | 12/24   | Isac Newton     |
      | MoneyCog    | 6        | Arnot Ben       | London St. | London | England | 50505   | visa     | 1111222233334444 | 12/24   | Arnot Ben       |