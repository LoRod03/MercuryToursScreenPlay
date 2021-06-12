Feature: register
  I want to register me in the web application Mercury Tours

  Scenario Outline: register in Mercury Tours
    Given that the user is on the registration page
    When the user enters the personal information
      | firstName   | lastName   | phoneNumber   | emailAddress   | userName   | password   |
      | <firstName> | <lastName> | <phoneNumber> | <emailAddress> | <userName> | <password> |
    Then could see the 'login successfully' text

    Examples:
      | firstName | lastName | phoneNumber | emailAddress    | userName | password |
      | Maria     | Florez   | 3143234     | maria@gmail.com | maflo    | 123*     |
      | Orlando   | Lima     | 3207564     | orli@gmail.com  | orlii    | 6354#    |
      | Pedro     | Castro   | 3176547     | pecas@gmail.com | pequitas | 9836##   |

