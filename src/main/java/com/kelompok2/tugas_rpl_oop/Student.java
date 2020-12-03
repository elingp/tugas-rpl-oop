package com.kelompok2.tugas_rpl_oop;

/**
 * @author Caesar Rio Anggina Toruan (185250207111034)
 * @author Hamdani Al-Ikhsan (185150201111061)
 * @author Marvel Timothy Raphael Manullang (185150200111089)
 * @author R. Komang Eling Pramuatmaja (185150200111081)
 */
public class Student extends User {
    private int stdId;

    public Student() {
    }

    public Student(int stdId) {
        this.stdId = stdId;
    }

    public Student(String name, String password, String email, String address, String contactNumber, int stdId) {
        super(name, password, email, address, contactNumber);
        this.stdId = stdId;
    }

    public int getStdId() {
        return stdId;
    }

    public void setStdId(int stdId) {
        this.stdId = stdId;
    }
}
