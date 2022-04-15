Feature: Nhs help costs test

  As a user I want to check if I  get help from Nhs or not

  Background:I am on start page

    When I click on accept cookies
    And I click on start  now button
    And I select wales as my live in country
    And I click on next button
    And I select yes radio button for question is your gp practice in scotland or wales
    And I click on next button after selecting gp practice question
    And I select wales as my dental practice
    And I click on next button after dental practice question





  Scenario: As a User I want to check if I get help with nhs costs for age 18 over

    When I enter "18" birth day in birthdate field
    And I enter "01" as birth month in birthdate field
    And I enter "1985" as my birth year in birthdate field
    And I click next button on radio button after birth date field
    And I click on yes radio button for do you live with your partner question
    And I click on next button after partner question
    And I click on yes radio button for tax credit and benefits question
    And I click on next button after tax credit question
    And I click on yes radio button for you and your partner get paid universal credit
    And I click on next buttton after paid universal credit question
    And I select yes radio button as a part of the universal credit
    And I click on next button after part of the universal credit question
    And I select yes radio button for getting paid £935 or less on last universal credit
    And I click  on next button after getting paid £935
    Then I see the result


  Scenario: As a User I want to check if I get help with nhs costs for age over 65
    When I enter "20" birth day in birthdate field
    And I enter "02" as birth month in birthdate field
    And  I enter "1955" as my birth year in birthdate field
    And I click next button on radio button after birth date field
    And I select no radio button for do you live with your partner question
    And I click on next button after partner question
    And I select no radio button for tax credit and benefits question
    And I click on next button after tax credit question
    And I select no for injury and illness caused by serving in the armed forces
    And I click on next button after injury and illness question
    And I select no for do you live permanently in care home question
    And I click on next button after living in care home questions
    And I select no for savings investment or property question
    And I click on next button after saving investment or property question
    Then I see the result you get help with nhs


  Scenario: As a User I want to check if I get help with nhs costs for age under 18
    When I enter "01" birth day in birthdate field
    And I enter "01" as birth month in birthdate field
    And  I enter "2000" as my birth year in birthdate field
    And I click next button on radio button after birth date field
    Then I see the result you get help with nhs for under age

