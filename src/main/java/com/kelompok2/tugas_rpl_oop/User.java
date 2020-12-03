package com.kelompok2.tugas_rpl_oop;

/**
 * @author Caesar Rio Anggina Toruan (185250207111034)
 * @author Hamdani Al-Ikhsan (185150201111061)
 * @author Marvel Timothy Raphael Manullang (185150200111089)
 * @author R. Komang Eling Pramuatmaja (185150200111081)
 */
public class User {
    private String name;
    private String password;
    private String email;
    private String address;
    private String contactNumber;

    public User() {
    }

    public User(String name, String password, String email, String address, String contactNumber) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.address = address;
        this.contactNumber = contactNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

}
