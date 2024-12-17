*** Settings ***
Resource    01_Settings.robot

*** Variables ***
#Web site
${Medusa}             https://45.136.236.146/
${account_btn}        css=[data-testid="nav-account-link"]
${SignUp_btn}         css=[data-testid="register-button"]
${Menu_btn}           css=[data-testid="nav-menu-button"]
${store_btn}          css=[data-testid="store-link"]
${cart_btn}           css=[data-testid="nav-cart-link"]
${menu_account_btn}   css=[data-testid="account-link"]
${menu_cart_btn}      css=[data-testid="cart-link"]  
${menu_search_btn}    css=[data-testid="search-link"]
${menu_home_btn}      css=[data-testid="home-link"]
${close_menu_btn}     css=[data-testid="close-menu-button"]
#SignUp page
${Firstname_box}      css=[data-testid="first-name-input"]
${Lastname_box}       css=[data-testid="last-name-input"]
${Email_box}          css=[data-testid="email-input"]
${Phone_box}          css=[data-testid="phone-input"]
${Password_box}       css=[data-testid="password-input"]
${ConfirmSignUp_btn}  css=[data-testid="register-button"]

#Signin page   
${Signin_btn}         css=[data-testid="sign-in-button"]
${Sn_mail_box}        css=[data-testid="email-input"]
${Sn_Pass_box}        css=[data-testid="password-input"]

#User's data
${Firstname}          group
${Lastname}           10
${EMAIL}              group105@gmail.com
${Phone}              1234567890
${PASSWORD}           test12345
${Address}            1600 Fake Street
${Address2}           Apartment 1
${Company}            Fake Company
${Postal}             94043
${City}               Mountain View
${States}             CA

${New_Firstname}          SEC2
${New_Lastname}           GROUP10
${New_EMAIL}              group10@gmail.com
${New_Phone}              0123456789
${New_PASSWORD}           test123
#Store page
${product1}           xpath=//p[@data-testid='product-title' and contains(text(), 'Medusa Coffee Mug')]

#product info page
${AddToCart}           css=[data-testid="add-product-button"]

#Cart page
${checkout_btn}       css=[data-testid="checkout-button"]

#Shiping address page
${shipping_first}         css=[data-testid="shipping-first-name-input"]
${shipping_last}          css=[data-testid="shipping-last-name-input"]
${shipping_address}       css=[data-testid="shipping-address-input"]
${shipping_company}       css=[data-testid="shipping-company-input"]
${shipping_postal}        css=[data-testid="shipping-postal-code-input"]
${shipping_city}          css=[data-testid="shipping-city-input"]
${shipping_province}      css=[data-testid="shipping-province-input"]
${shipping_phone}         css=[data-testid="shipping-phone-input"]
${DROPDOWN_country}       css=[data-testid='shipping-country-select']
${OPTION1}                xpath://li[text()='United States']
${OPTION2}                xpath://li[text()='Canada']
${SubmitAddress_btn}      css=[data-testid="submit-address-button"]
${delivery_option}        xpath:(//*[@data-testid="delivery-option-radio"])[1]
${submit_delivery_btn}    css=[data-testid="submit-delivery-option-button"]
${submit_payment_btn}     css=[data-testid="submit-payment-button"]
${submit_order_btn}       css=[data-testid="submit-order-button"]

# Account Page

${Account_overview_link}          xpath=//a[@data-testid='overview-link' and contains(text(), 'Overview')]
${Account_profile_link}           xpath=//a[@data-testid='profile-link' and contains(text(), 'Profile')]

${Account_addresses_link}         xpath=//a[@data-testid='addresses-link' and contains(text(), 'Addresses')]
${add_address_button}             css:[data-testid="add-address-button"]
${Account_first_name_input}       css:[data-testid="first-name-input"]
${Account_last_name_input}        css:[data-testid="last-name-input"]
${Account_company_input}          css:[data-testid="company-input"]
${Account_address_1_input}        css:[data-testid="address-1-input"]
${Account_address_2_input}        css:[data-testid="address-2-input"]
${Account_postal_code_input}      css:[data-testid="postal-code-input"]
${Account_city_input}             css:[data-testid="city-input"]
${Account_state_input}            css:[data-testid="state-input"]
${Account_phone_input}            css:[data-testid="phone-input"]
${Account_country_select}         css:[data-testid="country-select"]
${Account_cancel_btn}             css:[data-testid="cancel-button"]    
${Account_save_btn}               css:[data-testid="save-button"]
${Account_close_modal_btn}        css:[data-testid="close-modal-button"]
${Account_address_delete_btn}     css:[data-testid="address-delete-button"]
${Account_address_edit_btn}       css:[data-testid="address-edit-button"]

${orders_link}                    xpath=//a[@data-testid='orders-link' and contains(text(), 'Orders')]
${order_details_link}             css:[data-testid="order-details-link"]
${back_to_overview_btn}           css:[data-testid="back-to-overview-button"]

${Account_logout_btn}             xpath=//button[@data-testid='logout-button' and contains(text(), 'Log out')]


# Account Profile Page
${edit_button_name}               xpath=(//button[@data-testid='edit-button'])[1]
${edit_button_email}              xpath=(//button[@data-testid='edit-button'])[2]
${edit_button_phone}              xpath=(//button[@data-testid='edit-button'])[3]
${edit_button_password}           xpath=(//button[@data-testid='edit-button'])[4]
${edit_button_billing}            xpath=(//button[@data-testid='edit-button'])[5]

${save_edit_button_name}          xpath=(//button[@data-testid='save-button'])[1]
${save_edit_button_email}         xpath=(//button[@data-testid='save-button'])[2]
${save_edit_button_phone}         xpath=(//button[@data-testid='save-button'])[3]
${save_edit_button_pass}          xpath=(//button[@data-testid='save-button'])[4]
${save_edit_button_bill}          xpath=(//button[@data-testid='save-button'])[5]

${edit_first_input}               css:[data-testid="first-name-input"]
${edit_last_input}                css:[data-testid="last-name-input"]
${edit_email_input}               css:[data-testid="email-input"]
${edit_phone_input}               css:[data-testid="phone-input"]
${edit_old-password_input}        css:[data-testid="old-password-input"]
${edit_new-password_input}        css:[data-testid="new-password-input"]
${edit_confirm-password_input}    css:[data-testid="confirm-password-input"]


${billing_first_box}              css:[data-testid="billing-first-name-input"]
${billing_last_box}               css:[data-testid="billing-last-name-input"]
${billing_company_box}            css:[data-testid="billing-company-input"]
${billing_address1_box}           css:[data-testid="billing-address-1-input"]
${billing_address2_box}           css:[data-testid="billing-address-2-input"]
${billing_address2_box}           css:[data-testid="billing-address-2-input"]
${billing_postcal_box}            css:[data-testid="billing-postcal-code-input"]
${billing_postcal_box}            css:[data-testid="billing-postcal-code-input"]
${billing_city_box}               css:[data-testid="billing-city-input"]
${billing_province_box}           css:[data-testid="billing-province-input"]
${billing_country_box}            css:[data-testid="billing-country-code-select"]

