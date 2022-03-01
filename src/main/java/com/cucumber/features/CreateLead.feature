Feature: Testing Leads in LeafTaps Application 

@smoke 
Scenario: Login to LeafTaps Application 
	Given Login to LeafTaps Application 
	Then Verify User has successfully logged in 
	
@smoke 
Scenario: Enter CreateLead Page 
	Given Login to LeafTaps Application 
	And Click on CRMSFA Link 
	And Click Create Leads Link 
	
	