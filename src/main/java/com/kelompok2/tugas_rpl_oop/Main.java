package com.kelompok2.tugas_rpl_oop;
import java.lang.reflect.Array;
import java.util.*;
/**
 * @author Caesar Rio Anggina Toruan (185250207111034)
 * @author Hamdani Al-Ikhsan (185150201111061)
 * @author Marvel Timothy Raphael Manullang (185150200111089)
 * @author R. Komang Eling Pramuatmaja (185150200111081)
 */
public class Main {
    public static void main(String[] args) {
        Professor user1 = new Professor();
        user1.setName("Fernandes");
        user1.setEmail("Fernandes@gmail.com");
        user1.setPassword("Password");
        user1.setAddress("Jakarta");
        user1.setContactNumber("08135552123");
        user1.setStaffId(21113);
        user1.setStaffId(02112);
        user1.setSalary(2000);
        user1.setDepartment("Technology");

        Student user2 = new Student();
        user2.setName("Cia");
        user2.setEmail("cia@gmail.com");
        user2.setPassword("Password1");
        user2.setAddress("Jakarta");
        user2.setContactNumber("08135552124");
        user2.setStdId(11112);

        Student user3 = new Student();
        user3.setName("Nathalie");
        user3.setEmail("nathalie@gmail.com");
        user3.setPassword("Password2");
        user3.setAddress("Jakarta");
        user3.setContactNumber("08135552125");
        user3.setStdId(11113);

        Student user4 = new Student();
        user4.setName("John");
        user4.setEmail("john@gmail.com");
        user4.setPassword("Password3");
        user4.setAddress("Baubau");
        user4.setContactNumber("08135552126");
        user4.setStdId(11114);


        System.out.println("Halo dunia!");
        System.out.println(user1.getName());
        System.out.println(user1.getEmail());
        System.out.println(user1.getPassword());
        System.out.println(user1.getAddress());
        System.out.println(user1.getContactNumber());
        System.out.println(user1.getStaffId());



    }

}
