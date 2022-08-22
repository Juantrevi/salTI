package com.saltos.salti.Entities;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.DatabaseMetaData;
import java.sql.Date;

@Entity
public class Jump {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int jumpNumber;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date date;

    private String place;

    private String plane;

    private String chute;

    private int height;

    private String retardo;

    private int totalTime;

    private String maneuvers;

    private String wind;

    public Jump() {
    }

    public Jump(Long id, int jumpNumber, Date date, String place, String plane, String chute, int height, String retardo, int totalTime, String maneuvers, String wind) {
        this.id = id;
        this.jumpNumber = jumpNumber;
        this.date = date;
        this.place = place;
        this.plane = plane;
        this.chute = chute;
        this.height = height;
        this.retardo = retardo;
        this.totalTime = totalTime;
        this.maneuvers = maneuvers;
        this.wind = wind;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getJumpNumber() {
        return jumpNumber;
    }

    public void setJumpNumber(int jumpNumber) {
        this.jumpNumber = jumpNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getPlane() {
        return plane;
    }

    public void setPlane(String plane) {
        this.plane = plane;
    }

    public String getChute() {
        return chute;
    }

    public void setChute(String chute) {
        this.chute = chute;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getRetardo() {
        return retardo;
    }

    public void setRetardo(String retardo) {
        this.retardo = retardo;
    }

    public int getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    public String getManeuvers() {
        return maneuvers;
    }

    public void setManeuvers(String maneuvers) {
        this.maneuvers = maneuvers;
    }

    public String getWind() {
        return wind;
    }

    public void setWind(String wind) {
        this.wind = wind;
    }
}
