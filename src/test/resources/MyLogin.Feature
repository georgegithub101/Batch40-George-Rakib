Feature ⇒ what feature/function I’m testing (what to test)= Testing Login
Description ⇒ write some important requirement/need (optional)
Background ⇒ Common step (optional)
Scenario / Scenario Outline ⇒ detail steps (how to test) = as a user i want tlogin to automation site with valid credential
Given Open the browser "<aeURL>"
|aeURL|
|www.https://automationexercise.com/|
When ⇒ when click on login button in the 
And Enter email "<email>"
|email|
|george@gmail.com|
And Password "<password>"
|password|
|Bostonaldnjakld|
And Click on login button
Then ⇒ validation (hard assert/assert or soft assert)
And / Or ⇒ same steps multiple

