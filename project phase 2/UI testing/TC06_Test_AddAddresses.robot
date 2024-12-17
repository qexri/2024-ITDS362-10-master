*** Settings ***
Resource    01_Settings.robot
Resource    02_Variables.robot
Resource    03_Keywords.robot


*** Test Cases ***
TC-06 Signin Medusa Store
  Open Web Medusa Store
TC-06.1 Enter account page
  Enter account page
  Wait for load Page
TC-06.2 Sign in        
  Input info for Signin
  Enter Signin
  Wait for load Page
TC-06.3 select addresses
  Wait for load Page
  account page select Addresses
TC-06.4 Add New Addresses
  account page select Addresses Add New Addresses
TC-06.5 edit Address
  Wait for load Page
  account page select Addresses edit Address
TC-06.6 close edit Address 
  Wait for load Page
  account page select Addresses close edit Address 
TC-06.7 delete Address
  Wait for load Page
  account page select Addresses delete Address

