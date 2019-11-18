package oop_task;

public abstract class MessageProcessor{

    private String name;
    private String body;

    public String getName() { return name; }

    public void setBody(String body) {
        this.body = body;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBody() {
        return body;
    }
}
