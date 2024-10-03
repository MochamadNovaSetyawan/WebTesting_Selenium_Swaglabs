Feature: Login Page
  Background:
    Given Navigasi ke login page

    Scenario: User login dengan credential yang benar
      When Input "standard_user" di username field
      And Input "secret_sauce" di password field
      And Klik login button
      Then Berhasil bernavigasi ke home page

    Scenario Outline: Memastikan login dengan "<case>" tidak dapat masuk ke home page
      When Input "<username>" di username field
      And Input "<password>" di password field
      And Klik login button
      Then Tidak berhasil masuk ke login page dan terdapat alert "<alert>"

      Examples:
      | case                     |username        |password      |alert                                                                     |
      | email di kosongkan       |                | secret_sauce | Epic sadface: Username is required                                       |
      | password di kosongkan    | standard_user  |              | Epic sadface: Password is required                                       |
      | email dan password salah | standard_users | secret_sauces| Epic sadface: Username and password do not match any user in this service|