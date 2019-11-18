package oop_task;
//Define a class structure using the OOP principles for the following:
//        1. a MessageProcessor class that can 'process' different kinds of messages, outputting in console their contents
//        2. a structure for different Message classes (e.g. XmlMessage, JsonMessage, etc) that will implement a Message interface
//        3. they should all have a 'name' field with their actual name, and the 'body' field which will have message contents
//        4. they should all have a constructor method with a String parameter that will be assigned to 'body'
//        5. each Message should have different 'prepareMessage' methods implemented that will receive different parameter list
//        (empty/String/String, String) that should output in console their parameter values (if any) and the actual message type ('name')
//        6. a MessageConverter that can 'convert' messages from one type to another ('body' should be the same)

public class Main {
    public static void main(String[] args) {
        XmlMessage xml = new XmlMessage();
        xml.prepareMessage();
        xml.prepareMessage("Extensible Markup Language (XML) is a markup language");
        xml.prepareMessage("XML", "is useful language");
        xml.messageConverter("HTML");

        JsonMessage json = new JsonMessage();
        json.prepareMessage();
        json.prepareMessage("JavaScript Object Notation (JSON) is an open-standard file format");
        json.prepareMessage("Json", "is useful language");
        json.messageConverter("text");



    }
}
