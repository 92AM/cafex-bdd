Feature: Cafex

  Scenario: Buying Cola
    When I buy "Cola"
    Then As a result of buying cola the bill should be "£0.50"

  Scenario: Buying Cola and Coffee
    When I buy "Cola" and "Coffee"
    Then As a result of buying cola and coffee the bill should be "£1.50"

  Scenario: Buying Cola, Coffee and Cheese Sandwich
    When I buy "Cola", "Coffee" and "Cheese Sandwich"
    Then As a result of buying cola, coffee and cheese sandwich the bill should be "£3.85"

  Scenario: Buying Cola, Coffee, Cheese Sandwich and Steak Sandwich
    When I buy "Cola", "Coffee", "Cheese Sandwich" and "Steak Sandwich"
    Then As a result of buying cola, coffee, cheese sandwich and steak sandwich the bill should be "£9.60"

