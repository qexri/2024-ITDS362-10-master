*** Settings ***
Resource    01_Settings.robot
Resource    02_Variables.robot
Resource    03_Keywords.robot


*** Test Cases ***
TC-05 Signin Medusa Store
  Open Web Medusa Store
TC-05.1 Enter account page
  Enter account page
  Wait for load Page
TC-05.2 Sign in 
  Wait for load Page       
  Input info for Signin
  Enter Signin
TC-05.3 select Profile
  Wait for load Page
  account page select Profile
TC-05.4 select overview
  Wait for load Page
  account page select Overview
TC-05.5 select addresses
  Wait for load Page
  account page select Addresses
TC-05.6 select orders
  Wait for load Page
  account page select Orders
TC-05.7 select logout
  Wait for load Page
  account page select Log out