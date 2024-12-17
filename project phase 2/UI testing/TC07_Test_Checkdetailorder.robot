*** Settings ***
Resource    01_Settings.robot
Resource    02_Variables.robot
Resource    03_Keywords.robot


*** Test Cases ***
TC-07 Signin Medusa Store
  Open Web Medusa Store
TC-07.1 Enter account page
  Enter account page
  Wait for load Page
TC-07.2 Sign in        
  Input info for Signin
  Enter Signin
  Wait for load Page
TC-07.3 select Orders
  Wait for load Page
  account page select Orders
TC-07.4 select see details orders
  Wait for load Page
  account page select Orders See details
TC-07.5 Order details Back to Order
  Wait for load Page
  account page details Orders Back to Orders


