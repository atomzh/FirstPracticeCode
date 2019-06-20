package com.epam.first;

public class CivicH extends Honda {
    private String body;
    private int volume;
    private String color;
    private int maxspeed;
    private String owner;

    public CivicH(String body, int volume, String color, int maxspeed, String owner) {
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
        return "CivicH{" +
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

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public void move() {
        System.out.println("JJJJJJJJ I'm Civic");

    }
}
