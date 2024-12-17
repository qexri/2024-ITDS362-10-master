*** Settings ***
Resource    01_Settings.robot
Resource    02_Variables.robot
Resource    03_Keywords.robot


*** Test Cases ***
TC-08 Signin Medusa Store
  Open Web Medusa Store

TC-08.1 Enter account page
  Enter account page
  Wait for load Page

TC-08.2 Sign in        
  Input info for Signin
  Enter Signin
  Wait for load Page

TC-08.3 select Profile
  Wait for load Page
  account page select Profile

TC-08.4 Edit Profile name
  Wait for load Page
  edit name profile

TC-08.5 change Firstname+Lastname profile
  Wait for load Page 
  change Firstname profile
  change Lastname profile

TC-08.6 save edit name profile
  Wait for load Page
  save edit name profile


TC-08.7 Edit Profile email
  Wait for load Page
  edit Email profile

TC-08.8 change email profile
  Wait for load Page 
  change Email profile

TC-08.9 save edit email profile
  Wait for load Page
  save edit email profile

TC-08.10 Edit Profile Phone
  Wait for load Page
  edit Phone profile

TC-08.11 change Phone profile
  Wait for load Page 
  change Phone profile

TC-08.12 save edit Phone profile
  Wait for load Page
  save edit phone profile

TC-08.13 Edit Profile Password
  Wait for load Page
  edit Password profile 

TC-08.14 change email profile
  Wait for load Page 
  change Password profile

TC-08.15 save edit Password profile
  Wait for load Page
  save edit password profile
  
TC-08.16 Edit Profile Billing address
  Wait for load Page
  edit Billing address profile

TC-08.17 change email profile
  Wait for load Page 
  change Billing address profile

TC-08.18 save edit Billing address profile
  Wait for load Page
  save edit billing profile
