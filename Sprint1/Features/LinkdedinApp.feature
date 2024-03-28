
Feature: Linkedin App 
  User want to use this template for my feature file


  Background: Linkedin Login
    Given User opens Linkedin app
    When User enter username "pg.susmitha111@gmail.com"
    When User enter password "Susi.@123"
    And User enters on signin button
    Then User should navigate to home page
   
   Scenario: Notifications Icon
   	Given User clicks on notification icon
   	When user  navigate to notification page
   	And User click on specific notification
   	Then User Should driected to home by clicking relevant content associated with the notification
   
   Scenario: Notfications read
   	Given User clicks on notification 
   	When User clicks on notification view box
   	When User clicks on delete notification
   	And user want to undo deleted message
   	Then User can also undo deleted message by getting delete message
   	
   Scenario: Manage Notifications
   	Given User clicks on notifications
   	When User clicks on manage your notifications
   	When User  navigate to settings page
   	Then User should see a list of notifications displayed
   	 
   #Scenario: Notification marks as a read
#	    Given User Click on notifications
#	    When User attempts to mark a notifications as read
#	    Then User should see an error message indicating that the action could not be completed
#	   	
   
   #Scenario Outline: User manages notification settings for <notification_preference>
#	    Given User is on the Notifications page
#	    When User navigates to the Manage Notifications settings
#	    Then User should see options to manage their notification preferences
#	    Then User updates their notification preferences with <email>, <push_noti fications>, <messages>, and <in_app_notifications>
#	    Then The changes should be saved successfully
#	    And User should receive a confirmation message indicating that the settings have been updated
#	    
    #Examples: 
      #| notification preference | email | push_notifications | messages | in_app_notifications|
      #| Email                   | success  | fail            | success  | success             |
      #| Push Notifications      | fail  | success            | success  | fail                |
      #| SMS                     | success  | sucess          | success  | success             |
#
