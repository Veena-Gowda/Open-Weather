
Feature: Validating Temperature API's

@FirstScenario
Scenario: Verify the Temperature is predicted to be above 20 degrees in the next 5 days

Given Open Weather Map 

When User calls GetTemperature API predicted to be above 20 degrees in the next 5 days with http Get request

Then the API call is success with status code 200

And status in response body is OK



