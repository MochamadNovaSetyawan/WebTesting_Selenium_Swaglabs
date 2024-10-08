Feature: Menu Page
  Background:
    Given Sudah login

    Scenario Outline: Memastikan navigasi menu "<menu>" berfungsi sesuai fungsionalitas yang diharapkan
      When Klik produk detail "<product>"
      And  Klik menu button
      And Klik menu "<menu>"
      Then Berhasil mengarahkan ke "<navigate>"

      Examples:
        |menu     |product            |navigate     |
        |All Items|Sauce Labs Backpack|product page |
        |About    |Sauce Labs Backpack|about page   |
        |Logout   |Sauce Labs Backpack|login page   |

    Scenario : Memastikan menu "Reset App State"
      When