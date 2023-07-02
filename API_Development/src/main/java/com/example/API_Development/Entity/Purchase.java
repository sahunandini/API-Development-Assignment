package com.example.API_Development.Entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "purchases")
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date")
    private LocalDateTime date;

    @Column(name = "user")
    private String user;

    @Column(name = "department")
    private String department;

    @Column(name = "software")
    private String software;

    @Column(name = "seats")
    private int seats;

    @Column(name = "amount")
    private double amount;

    // Constructors, getters, and setters

    public Purchase() {
    }

    public Purchase(LocalDateTime date, String user, String department, String software, int seats, double amount) {
        this.date = date;
        this.user = user;
        this.department = department;
        this.software = software;
        this.seats = seats;
        this.amount = amount;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSoftware() {
        return software;
    }

    public void setSoftware(String software) {
        this.software = software;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}

