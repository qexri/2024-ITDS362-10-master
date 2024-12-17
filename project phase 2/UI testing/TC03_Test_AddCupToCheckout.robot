*** Settings ***
Resource    01_Settings.robot
Resource    02_Variables.robot
Resource    03_Keywords.robot


*** Test Cases ***
TC-03 Signin Medusa Store
  Open Web Medusa Store
TC-03.1 Enter account page
  Enter account page
  Wait for load Page
TC-03.2 Sign in        
  Input info for Signin
  Enter Signin
TC-03.3 Enter Menu
  Enter Menu
  Wait for load Page
TC-03.4 Enter Store 
  Enter Store page
  Wait for load Page
TC-03.5 select product  
  select product
  Wait for load Page
TC-03.6 add product to cart     
  add to cart
  Wait for load Page
TC-03.7 check product in cart        
  check cart
TC-03.8 checkout product
  Wait for load Page
  checkout product in cart
TC-03.9 Input info for Shipping Address
  Wait for load Page
  Input info for Shipping Address
  continue to delivery
TC-03.10 select delivery
  Wait for load Page
  select delivery
  Wait for load Page
  continue to payment
TC-03.11 select payment
  Wait for load Page
  continue to review
TC-03.10 Place order
  Wait for load Page
  Place order


