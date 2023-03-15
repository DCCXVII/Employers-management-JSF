package com.example.Controllers;

import java.io.Serializable;
import java.sql.Date;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@RequestScoped
@Named
public class Task implements Serializable{
    private Date date;
    private State state;
    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    

    public enum State {
        OPENED,
        CLOSED,
        DECLINED
    }

    
}

