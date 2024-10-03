Feature: Menu Page
  Background:
    Given Sudah login

    Scenario: Memastikan menu "All Items" bernavigasi sesuai dengan fungsionalitas
      When Klik produk detail "Sauce Labs Backpack"
      And  Klik menu button
      And Klik "All Items"
      Then Berhasil mengarahkan ke product page




#    Scenario: Memastikan menu "About" bernavigasi sesuai dengan fungsionalitas
#      When  Klik menu button
#      And Klik "About"
#      Then Berhasil mengarahkan ke about page
#
#    Scenario: Memastikan menu "Logout" bernavigasi sesuai dengan fungsionalitas
#      When  Klik menu button
#      And Klik "Logout"
#      Then Berhasil mengarahkan ke login page