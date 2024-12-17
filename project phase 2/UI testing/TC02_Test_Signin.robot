*** Settings ***
Resource    01_Settings.robot
Resource    02_Variables.robot
Resource    03_Keywords.robot


*** Test Cases ***
TC-02 Signin Medusa Store
  Open Web Medusa Store
TC-02.1 Enter account page
  Enter account page
  Wait for load Page
TC-02.2 Sign in               
  Input info for Signin
  Enter Signin