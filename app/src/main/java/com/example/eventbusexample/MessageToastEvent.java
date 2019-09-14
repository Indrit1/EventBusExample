package com.example.eventbusexample;

public class MessageToastEvent {

    public MessageToastEvent(String message) {
        this.message = message;
    }

    public final String message;
}
