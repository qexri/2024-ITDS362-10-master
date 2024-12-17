*** Settings ***
Resource    01_Settings.robot
Resource    02_Variables.robot

*** Keywords ***

Wait for load Page
    Sleep    3s

Open Web Medusa Store
    Open Browser    ${Medusa}    firefox  

Enter account page
    Click Element     ${account_btn}  

Enter SignUp
    Click Element     ${SignUp_btn}

Confirm SignUp
    Click Element     ${ConfirmSignUp_btn}

Enter Signin
    Click Element  ${Signin_btn}

Input info for SignUp
    Input Text     ${Firstname_box}   ${Firstname}
    Input Text     ${Lastname_box}    ${Lastname}
    Input Text     ${Email_box}       ${EMAIL}
    Input Text     ${Phone_box}       ${Phone}
    Input Text     ${Password_box}    ${PASSWORD}

Input info for Signin
    Input Text     ${Sn_mail_box}       ${EMAIL}
    Input Text     ${Sn_Pass_box}    ${PASSWORD}

Enter Menu
    Click Element  ${Menu_btn}

Enter Store page
    Click Element  ${store_btn}

select product
    Click Element  ${product1}

add to cart
    Click Element  ${AddToCart}

check cart
    Click Element  ${cart_btn}

checkout product in cart
    Click Element  ${checkout_btn}

Input info for Shipping Address
    Input Text     ${shipping_first}        ${Firstname} 
    Input Text     ${shipping_last}         ${Lastname}
    Input Text     ${shipping_address}      ${Address}
    Input Text     ${shipping_company}      ${Company} 
    Input Text     ${shipping_postal}       ${Postal}
    Input Text     ${shipping_city}         ${City}
    Input Text     ${shipping_province}     ${States}
    Input Text     ${shipping_phone}        ${Phone} 
    Click Element  ${DROPDOWN_country}
    Sleep    2s
    Select From List By Label    ${DROPDOWN_country}    United States

continue to delivery
    Click Element  ${SubmitAddress_btn}

select delivery
    Click Element  ${delivery_option}

continue to payment
    Click Element  ${submit_delivery_btn}

continue to review
    Click Element  ${submit_payment_btn}

Place order
    Click Element  ${submit_order_btn}

select menu home
    Click Element  ${menu_home_btn}

select menu store
    Click Element  ${store_btn}

select menu search
    Click Element  ${menu_search_btn}

select menu account
    Click Element  ${menu_account_btn}

select menu cart
    Click Element  ${menu_cart_btn}

account page select Profile
    Sleep    3s
    Click Element  ${Account_profile_link}

account page select Overview
    Sleep    3s
    Click Element  ${Account_overview_link}

account page select Addresses
    Sleep    3s
    Click Element  ${Account_addresses_link}

account page select Orders
    Sleep    3s
    Click Element  ${orders_link}

account page select Log out
    Sleep    3s
    Click Element  ${Account_logout_btn}

account page select Addresses Add New Addresses
    Sleep    3s
    Click Element  ${add_address_button}
    Sleep    3s
    Input Text     ${Account_first_name_input}        ${Firstname} 
    Input Text     ${Account_last_name_input}         ${Lastname}
    Input Text     ${Account_company_input}           ${Company} 
    Input Text     ${Account_address_1_input}         ${Address}
    Input Text     ${Account_address_2_input}         ${Address2}
    Input Text     ${Account_postal_code_input}       ${Postal}
    Input Text     ${Account_city_input}              ${City}
    Input Text     ${Account_state_input}             ${States}
    Input Text     ${Account_phone_input}             ${Phone}
    Click Element  ${Account_country_select}
    Sleep    2s
    Select From List By Label    ${Account_country_select}    Canada
    Click Element  ${Account_save_btn}

account page select Addresses delete Address
    Click Element  ${Account_address_delete_btn}

account page select Addresses edit Address
    Click Element  ${Account_address_edit_btn}

account page select Addresses close edit Address 
    Click Element  ${Account_cancel_btn}

account page select Orders See details
    Click Element  ${order_details_link}

account page details Orders Back to Orders
    Click Element  ${back_to_overview_btn}


close_menu_btn
    Click Element   ${close_menu_btn} 

edit name profile
    Wait Until Element Is Visible    ${edit_button_name}    5s
    Click Element   ${edit_button_name}

change Firstname profile
    Input Text     ${edit_first_input}             ${New_Firstname}

change Lastname profile
    Input Text     ${edit_last_input}             ${New_Lastname}

save edit name profile
    Wait Until Element Is Visible    ${save_edit_button_name}    5s
    Click Element   ${save_edit_button_name}
save edit email profile
    Wait Until Element Is Visible    ${save_edit_button_email}    5s
    Click Element   ${save_edit_button_email}
save edit phone profile
    Wait Until Element Is Visible    ${save_edit_button_phone}    5s
    Click Element   ${save_edit_button_phone}
save edit password profile
    Wait Until Element Is Visible    ${save_edit_button_pass}    5s
    Click Element   ${save_edit_button_pass}
save edit billing profile
    Wait Until Element Is Visible    ${save_edit_button_bill}    5s
    Click Element   ${save_edit_button_bill}

edit Email profile
    Wait Until Element Is Visible    ${edit_button_email}    5s
    Click Element   ${edit_button_email}

edit Phone profile
    Wait Until Element Is Visible    ${edit_button_phone}    5s
    Click Element   ${edit_button_phone}

edit Password profile
    Wait Until Element Is Visible    ${edit_button_password}    5s
    Click Element   ${edit_button_password}

edit Billing address profile
    Wait Until Element Is Visible    ${edit_button_billing}    5s
    Click Element   ${edit_button_billing}

change Email profile
    Input Text     ${edit_email_input}             ${New_EMAIL}

change Phone profile
    Input Text     ${edit_phone_input}             ${New_Phone}

change Password profile
    Input Text     ${edit_old-password_input}             ${PASSWORD}
    Input Text     ${edit_new-password_input}             ${New_PASSWORD}
    Input Text     ${edit_confirm-password_input}         ${New_PASSWORD}

change Billing address profile
    Input Text     ${billing_first_box}                   ${New_Firstname}
    Input Text     ${billing_last_box}                    ${New_Lastname}
    Input Text     ${billing_company_box}                 ${Company}
    Input Text     ${billing_address1_box}                ${Address}
    Input Text     ${billing_address2_box}                ${Address2}
    Input Text     ${billing_postcal_box}                 ${Postal}
    Input Text     ${billing_city_box}                    ${City}
    Input Text     ${billing_province_box}                ${States}
    Click Element  ${billing_country_box}
    Sleep    2s
    Select From List By Label    ${billing_country_box}    Denmark





