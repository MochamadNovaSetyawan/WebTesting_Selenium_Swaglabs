Feature: Menu Page
  Background:
    Given Sudah login

    Scenario Outline: Memastikan menu "<menu>" bernavigasi sesuai dengan fungsionalitas
      When Klik produk detail "<product>"
      And  Klik menu button
      And Klik menu "<menu>"
      Then Berhasil "<navigate>"

      Examples:
        |menu     |product            |navigate                    |
        |All Items|Sauce Labs Backpack|mengarahkan ke product page |
        |About    |Sauce Labs Backpack|mengarahkan ke about page   |
        |Logout   |Sauce Labs Backpack|mengarahkan ke login page   |

    Scenario : 