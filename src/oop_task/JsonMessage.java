package oop_task;

public class JsonMessage extends MessageProcessor implements Message {
    public JsonMessage() {
        setName("Json");
        setBody("Smth");
    }

    @Override
    public void prepareMessage() {
        System.out.println(getName()+"-"+ getBody());
    }

    @Override
    public void prepareMessage(String body) {
        setBody(body);
        System.out.println(getName()+"-"+ getBody());
    }

    @Override
    public void prepareMessage(String body, String body2) {
        setBody(body+" "+body2);
        System.out.println(getName()+"-"+ getBody());

    }
    @Override
    public void messageConverter(String newName) {
        setName(newName);
        System.out.println("New message type:");
        System.out.println(getName()+"-"+ getBody());
    }
}
