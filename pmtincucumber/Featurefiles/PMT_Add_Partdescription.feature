Feature: PMT Add Product List
Description: User will add part description for that part#


Scenario: Adding part description Test case
Given User will go to parts page and search for the part#
When User will click on the part description and landed in description page
And Choose the notes type dropdown, enter the notes and click on save button
Then User will see successfull alert and verify the record is shown in grid


Scenario: Editing part description Test case
Given User will go to parts page and search for the part#
When User will click on part description frame and will edit the notes & saved
Then User will see successfull alert and verify the record should be edited



Scenario: Deleting part description Test case
Given User will go to parts page and search for the part#
When User will click on part description frame and will delete the added or available record
Then User will see successfull alert and verify the record should be deleted
