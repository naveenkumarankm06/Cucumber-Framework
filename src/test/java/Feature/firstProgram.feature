Feature: Application Login

Background:
Given setup the entries in database
When launch the browser from config variables
And hit the home page url of banking site

@RegressionTest
Scenario: Admin Page default login
Given User is on NetBanking landing page
When User login into application with user "admin" and password "7321"
Then Home Page is displayed
And Cards are displayed

Scenario: Regex pattern check
Given User is on NetBanking landing page
When User login into application with user admin and password 7321"
Then Home Page is displayed
And Cards are displayed

@smokeTest
Scenario: Multiple value passing
Given User is on NetBanking landing page
When User login into application
| Naveen |
| Kumaran |
|ldsfkld@gmail.com|
|4453454|
Then Home Page is displayed
And Cards are displayed

@smokeTest
Scenario Outline: Mortgage User Page default login
Given User is on NetBanking landing page
When User login into application with user "<Username>" and password "<Password>"
Then Home Page is displayed 
And Cards are displayed

Examples:
 | Username	 | Password |
 | debituser |  hello12 |
 | crediuser |  lpo213  |

