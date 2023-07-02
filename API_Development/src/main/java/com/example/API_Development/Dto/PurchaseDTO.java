package com.example.API_Development.Dto;

import java.time.LocalDateTime;

public class PurchaseDTO {
    private Long id;
    private LocalDateTime date;
    private String user;
    private String department;
    private String software;
    private int seats;
    private double amount;

    public PurchaseDTO() {
    }

    public PurchaseDTO(Long id, LocalDateTime date, String user, String department, String software, int seats, double amount) {
        this.id = id;
        this.date = date;
        this.user = user;
        this.department = department;
        this.software = software;
        this.seats = seats;
        this.amount = amount;
    }

    // Getters and setters

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

