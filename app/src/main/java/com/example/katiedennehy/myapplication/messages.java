package com.example.katiedennehy.myapplication;
//https://www.youtube.com/watch?v=wVCz1a3ogqk
/**
 * Created by Katie Dennehy on 30/07/2017.
 */

public class messages {

    private String message, type;
    private long  time;
    private boolean seen;

    private String from;

//Getters and setters

    public messages(String from) {
        this.from = from;
    }
    public String getFrom() {
        return from;
    }
    public void setFrom(String from) {
        this.from = from;
    }
    public messages(String message, String type, long time, boolean seen) {

        this.message = message;

        this.type = type;

        this.time = time;

        this.seen = seen;

    }
    public String getMessage() {

        return message;
    }
    public void setMessage(String message) {

        this.message = message;
    }
    public String getType() {

        return type;
    }

    public void setType(String type) {

        this.type = type;
    }
    public long getTime() {

        return time;
    }

    public void setTime(long time) {

        this.time = time;
    }

    public boolean isSeen() {

        return seen;
    }
    public void setSeen(boolean seen) {

        this.seen = seen;
    }
    public messages(){
    }
}

