package com.example.Controllers;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@RequestScoped
@Named

public class Project implements Serializable{

    private String name;
    private Date dateDebut;
    private Date dateFin;
   
    private List<Task> tasks;
    private List<String> employers;
    private int id;
    private String Description; 


    public String getDescription() {
        return Description;
    }
    public void setDescription(String description) {
        Description = description;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public List<Task> getTasks() {
        return tasks;
    }
    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
    public List<String> getEmployers() {
        return employers;
    }
    public void setEmployers(List<String> Employers) {
        employers = Employers;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getDateDebut() {
        return dateDebut;
    }
    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }
    public Date getDateFin() {
        return dateFin;
    }
    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }
}
