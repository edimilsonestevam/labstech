#Author: edimilsonestevam@gmail.com

@Scenarios
Feature: Sending a message to a Message Server
  I want to send a message to a Message Server

  @ScenarioFirstSendMessageToMessageServer
  Scenario: User sends a message to a Message Server
		Given a User sends an <menssageFirst> message
		When the message is converted by the Adapter
		Then the Message server should contain the <messageSecond> message in the queue


      | messageFirst | messageSecond |
      | "hello"      |     "hello"   |