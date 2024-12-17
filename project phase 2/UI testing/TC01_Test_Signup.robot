*** Settings ***
Resource    01_Settings.robot
Resource    02_Variables.robot
Resource    03_Keywords.robot


*** Test Cases ***
TC-01 Signup Medusa Store
  Open Web Medusa Store
TC-01.1 Enter account page
  Enter account page
  Wait for load Page
TC-01.2 Enter SignUp page               
  Enter SignUp
  Wait for load Page
TC-01.3 Confirm SignUp                  
  Input info for SignUp
  Confirm SignUp