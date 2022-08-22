package com.saltos.salti.Entities;

import com.sun.istack.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Skydiver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String surname;

    private String password;

    private int idNumber;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date birthDate;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date licenseExp;

    private String email;



    @OneToMany
    private List<Jump> jump;

    private int numberOfJumps;


    public Skydiver() {
    }

    public Skydiver(Long id, String name, String surname, int idNumber, Date birthDate, Date licenseExp, String email, List<Jump> jump, int numberOfJumps) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.idNumber = idNumber;
        this.birthDate = birthDate;
        this.licenseExp = licenseExp;
        this.email = email;
        this.jump = jump;
        this.numberOfJumps = numberOfJumps;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getLicenseExp() {
        return licenseExp;
    }

    public void setLicenseExp(Date licenseExp) {
        this.licenseExp = licenseExp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Jump> getJump() {
        return jump;
    }

    public void setJump(List<Jump> jump) {
        this.jump = jump;
    }

    public int getNumberOfJumps() {
        return numberOfJumps;
    }

    public void setNumberOfJumps(int numberOfJumps) {
        this.numberOfJumps = numberOfJumps;
    }
}
