Feature: Final Project Web Testing https://www.demoblaze.com/

  @web
  Scenario: Test Home  PRODUCT STORE
    Given Open link PRODUCT STORE
    Then User will in home Product Store

  @web
  Scenario: Test Categories in Product Store
    Given Open link PRODUCT STORE
    And Click Phones
    Then Will show all type phone
    And Click Laptops
    Then Will show all type laptop
    And Click Monitors
    Then Will show all type monitor

  @web
  Scenario: Access Contact in product Store
    Given Open link PRODUCT STORE
    And Click nav contact
    And User fill Contact Email "kikamn@gmail.com"
    And User fill Contact Name "Kika"
    And User fill Message "Oki doki"
    And Click button Send message
    And Click oke in alert
    Then Will back home

  @web
  Scenario: User can close form log in
    Given Open link PRODUCT STORE
    And Click nav Log in
    And Click button Close in Log in
    Then Will back home

  @web
  Scenario: User can see About Us
    Given Open link PRODUCT STORE
    And Click nav About US
    Then Will show video player

  @web
  Scenario: User Login with Username and password valid
    Given Open link PRODUCT STORE
    And Click nav Log in
    And Fill Username "kikamn"
    And Fill password "Kika1234"
    And Click button Log in
    Then Log in will be successful
    Then Will show "Welcome kikamn" at top right of the page

  @web
  Scenario: User log in with username and password invalid
    Given Open link PRODUCT STORE
    And Click nav Log in
    And Fill Username "rizkika"
    And Fill password "kikamn1234"
    And Click button Log in
    Then Will show alert "User does not exist."

  @web
  Scenario: User log in with username and password empty
    Given Open link PRODUCT STORE
    And Click nav Log in
    And Fill Username " "
    And Fill password ""
    And Click button Log in
    Then Will show alert "Please fill out Username and Password."

  @web
  Scenario: User log in with username valid and password invalid
    Given Open link PRODUCT STORE
    And Click nav Log in
    And Fill Username "kikamn"
    And Fill password "kikamn123456"
    And Click button Log in
    Then Will show alert "Wrong password."

  @web
  Scenario: User log in with username invalid and password valid
    Given Open link PRODUCT STORE
    And Click nav Log in
    And Fill Username "rizkika"
    And Fill password "Kika1234"
    And Click button Log in
    Then Will show alert "User does not exist."

  @web
  Scenario: User can log out in
    Given Open link PRODUCT STORE
    And Click nav Log in
    And Fill Username "kikamn"
    And Fill password "Kika1234"
    And Click button Log in
    And Click button Log out
    #Then Will back home

  @web
  Scenario: User sign up with username and password not register
    Given Open link PRODUCT STORE
    And Click nav Sign up
    And Fill Username Sign up "Munaroh"
    And Fill password Sign up "Munaroh1234"
    And Click button sign up
    And Will show alert "Sign up successful."
    Then Will back home

  @web
  Scenario: User sign up with username and password registered
    Given Open link PRODUCT STORE
    And Click nav Sign up
    And Fill Username Sign up "kikamn"
    And Fill password Sign up "Kika1234"
    And Click button sign up
    Then Will show alert "This user already exist."

  @web
  Scenario: User sign up with username and password empty
    Given Open link PRODUCT STORE
    And Click nav Sign up
    And Fill Username Sign up ""
    And Fill password Sign up ""
    And Click button sign up
    Then Will show alert "Please fill out Username and Password."

  @web
  Scenario: User can close form sign up
    Given Open link PRODUCT STORE
    And Click nav Sign up
    And Click button close sign up
    Then Will back home

  @web
  Scenario: User can see detail from product
    Given Open link PRODUCT STORE
    And Click title product
    Then Will show detail product
    Then Image product
    Then Title product
    Then Price product
    Then Description product
    Then Click Button Add to Cart

  @web
  Scenario: User can access Cart or add to cart in Cart
    Given Open link PRODUCT STORE
    And Click title product
    And Click Button Add to Cart
    And Will show alert "Product added"
    And Click Nav Cart
    Then Will show purchased products

  @web
  Scenario: User can delete product in Cart
    Given Open link PRODUCT STORE
    And Click title product
    And Click Button Add to Cart
    And Will show alert "Product added"
    And Click Nav Cart
    And Click button Delete
    Then Cart will empty

  @web
  Scenario: User can close Place Order
    Given Open link PRODUCT STORE
    And Click title product
    And Click Button Add to Cart
    And Will show alert "Product added"
    And Click Nav Cart
    And Click button Place Order
    And Click button Close Place Order
    Then Will back to Cart

  @web
  Scenario: User can not buy product without fill form
    Given Open link PRODUCT STORE
    And Click title product
    And Click Button Add to Cart
    And Will show alert "Product added"
    And Click Nav Cart
    And Click button Place Order
    And Fill Name ""
    And Fill County ""
    And Fill City ""
    And Fill Credit card ""
    And Fill Month ""
    And Fill year ""
    And Click button Purchase
    Then Will show alert "Please fill out Name and Creditcard."

  @web
  Scenario: User can fill form mandatory Name and Credit card
    Given Open link PRODUCT STORE
    And Click title product
    And Click Button Add to Cart
    And Will show alert "Product added"
    And Click Nav Cart
    And Click button Place Order
    And Fill Name "KikaMN"
    And Fill Credit card "12345676"
    And Click button Purchase
    Then Will show Thank you for your purchase!
    Then Can click oke

  @web
  Scenario: User can fill all form for to buy product
    Given Open link PRODUCT STORE
    And Click title product
    And Click Button Add to Cart
    And Will show alert "Product added"
    And Click Nav Cart
    And Click button Place Order
    And Fill Name "Kika"
    And Fill County "Indonesia"
    And Fill City "Jakarta"
    And Fill Credit card "12345676"
    And Fill Month "10"
    And Fill year "2024"
    And Click button Purchase
    Then Will show Thank you for your purchase!
    Then Can click oke









