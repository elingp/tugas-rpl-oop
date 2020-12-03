package com.kelompok2.tugas_rpl_oop;

/**
 * @author Caesar Rio Anggina Toruan (185250207111034)
 * @author Hamdani Al-Ikhsan (185150201111061)
 * @author Marvel Timothy Raphael Manullang (185150200111089)
 * @author R. Komang Eling Pramuatmaja (185150200111081)
 */
public class Professor extends User {
    private int staffId;
    private float salary;
    private String department;

    public Professor() {
    }

    public Professor(int staffId, float salary, String department) {
        this.staffId = staffId;
        this.salary = salary;
        this.department = department;
    }

    public Professor(String name, String password, String email, String address, int contactNumber, int staffId, float salary, String department) {
        super(name, password, email, address, contactNumber);
        this.staffId = staffId;
        this.salary = salary;
        this.department = department;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}
