Feature: Whatsapp test

@TC01
Scenario: User should be notified if whatsapp application is open in some other tab of the same browser
Given Login screen of whatsapp web application is displayed
When User opens whatsapp web application in a new tab
And Switches back to previous tab
Then A popup with the message 'Whatsapp is open in another window. Click "Use Here" to use WhatsApp in this window' should be displayed with 'CLOSE' & 'USE HERE' options


@TC02
Scenario: Login page of whatsapp should get loaded by clicking on 'USE HERE' and in the previous tab the popup should be displayed
Given A popup with the message ' Whatsapp is open in another window. Click "Use Here" to use WhatsApp in this window' and options 'CLOSE' & 'USE HERE' is displayed
When User clicks on 'USE HERE' option
And In the previous tab, popup with message  'Whatsapp is open in another window. Click "Use Here" to use WhatsApp in this window' and options 'CLOSE' & 'USE HERE' should be displayed
Then Login page of whatsapp should get loaded

@TC03
Scenario: Whatsapp home screen should be displayed on clicking on 'CLOSE' option
Given A popup with the message ' Whatsapp is open in another window. Click "Use Here" to use WhatsApp in this window' and options 'CLOSE' & 'USE HERE' is displayed
When User clicks on 'CLOSE' option
Then �Whatsapp.com� page should get loaded
