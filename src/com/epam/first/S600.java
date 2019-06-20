package com.epam.first;

public class S600 extends Mercedes{
    private String body;
    private int volume;
    private String color;
    private int maxspeed;
    private String owner;

    public S600(String body, int volume, String color, int maxspeed, String owner) {
        this.body = body;
        this.volume = volume;
        this.color = color;
        this.maxspeed = maxspeed;
        if (owner=="")
        {
            this.owner = "Without owner";
        }
        else
        {
            this.owner = owner;
        }
    }

    @Override
    public String toString() {
        return "S600{" +
                "body='" + body + '\'' +
                ", volume=" + volume +
                ", color='" + color + '\'' +
                ", maxspeed=" + maxspeed +
                ", owner='" + owner + '\'' +
                '}';
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public void move() {
        System.out.println("Tratatatata I'm mers");
    }
}
