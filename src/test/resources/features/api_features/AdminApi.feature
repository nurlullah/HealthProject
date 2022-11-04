
Feature: Admin validate all Physicians

@GetPhysiciansAllInfo
Scenario:Doctor all info populated

Given admin get request for doctor
Then verify the doctor with id 10520 is exist