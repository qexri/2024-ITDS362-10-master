*** Settings ***
Resource    01_Settings.robot
Resource    02_Variables.robot
Resource    03_Keywords.robot


*** Test Cases ***
TC-04 Signin Medusa Store
  Open Web Medusa Store
TC-04.1 Enter account page
  Wait for load Page
  Enter account page
TC-04.2 Sign in
  Wait for load Page        
  Input info for Signin
  Enter Signin
TC-04.3 Enter Menu
  Enter Menu
  Wait for load Page
TC-04.4 select menu home
  select menu home
  Wait for load Page
  Enter Menu
TC-04.5 select menu store
  select menu store
  Wait for load Page
  Enter Menu
TC-04.6 select menu cart
  select menu cart
  Wait for load Page
  Enter Menu
TC-04.7 select menu account
  select menu account
  Wait for load Page
  Enter Menu
TC-04.8 select menu search
  Wait for load Page
  select menu search
