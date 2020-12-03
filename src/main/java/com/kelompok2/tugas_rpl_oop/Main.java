package com.kelompok2.tugas_rpl_oop;

import java.util.*;

/**
 * @author Caesar Rio Anggina Toruan (185250207111034)
 * @author Hamdani Al-Ikhsan (185150201111061)
 * @author Marvel Timothy Raphael Manullang (185150200111089)
 * @author R. Komang Eling Pramuatmaja (185150200111081)
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<User> daftarUser = new LinkedList<>();
        List<Professor> daftarProfessor = new LinkedList<>();
        List<Student> daftarStudent = new LinkedList<>();
        String name, password, email, address, contactNumber, department;
        int staffId, stdId;
        float salary;
        boolean isContinue = true;

        while (isContinue) {
            System.out.println("==MENU==");
            System.out.println("1. Tambah User");
            System.out.println("2. Tambah Profesor");
            System.out.println("3. Tambah Siswa");
            System.out.println("4. Lihat User");
            System.out.println("5. Lihat Profesor");
            System.out.println("6. Lihat Siswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            String input = in.nextLine();
            System.out.println();

            switch (input) {
                case "1":
                    System.out.println("Tambah User");
                    System.out.print("Nama: ");
                    name = in.nextLine();
                    System.out.print("Password: ");
                    password = in.nextLine();
                    System.out.print("Email: ");
                    email = in.nextLine();
                    System.out.print("Alamat: ");
                    address = in.nextLine();
                    System.out.print("Telepon: ");
                    contactNumber = in.nextLine();
                    User user = new User(name, password, email, address, contactNumber);
                    daftarUser.add(user);
                    System.out.println("Penambahan User " + name + " berhasil!\n");
                    break;
                case "2":
                    System.out.println("Tambah Profesor");
                    System.out.print("Nama: ");
                    name = in.nextLine();
                    System.out.print("Password: ");
                    password = in.nextLine();
                    System.out.print("Email: ");
                    email = in.nextLine();
                    System.out.print("Alamat: ");
                    address = in.nextLine();
                    System.out.print("Telepon: ");
                    contactNumber = in.nextLine();
                    System.out.print("ID Staf: ");
                    staffId = Integer.parseInt(in.nextLine());
                    System.out.print("Gaji: ");
                    salary = Float.parseFloat(in.nextLine());
                    System.out.print("Departemen: ");
                    department = in.nextLine();
                    Professor professor = new Professor(name, password, email, address, contactNumber, staffId, salary, department);
                    daftarProfessor.add(professor);
                    System.out.println("Penambahan Profesor " + name + " berhasil!\n");
                    break;
                case "3":
                    System.out.println("Tambah Siswa");
                    System.out.print("Nama: ");
                    name = in.nextLine();
                    System.out.print("Password: ");
                    password = in.nextLine();
                    System.out.print("Email: ");
                    email = in.nextLine();
                    System.out.print("Alamat: ");
                    address = in.nextLine();
                    System.out.print("Telepon: ");
                    contactNumber = in.nextLine();
                    System.out.print("ID Siswa: ");
                    stdId = Integer.parseInt(in.nextLine());
                    Student student = new Student(name, password, email, address, contactNumber, stdId);
                    daftarStudent.add(student);
                    System.out.println("Penambahan Siswa " + name + " berhasil!\n");
                    break;
                case "4":
                    System.out.println("Daftar User");
                    for (User e : daftarUser) {
                        System.out.printf("Nama:\t\t %s\n", e.getName());
                        System.out.printf("Password:\t %s\n", e.getPassword());
                        System.out.printf("Email:\t\t %s\n", e.getEmail());
                        System.out.printf("Alamat:\t\t %s\n", e.getAddress());
                        System.out.printf("Telepon:\t %s\n", e.getContactNumber());
                        System.out.println();
                    }
                    break;
                case "5":
                    System.out.println("Daftar Profesor");
                    for (Professor e : daftarProfessor) {
                        System.out.printf("Nama:\t\t %s\n", e.getName());
                        System.out.printf("Password:\t %s\n", e.getPassword());
                        System.out.printf("Email:\t\t %s\n", e.getEmail());
                        System.out.printf("Alamat:\t\t %s\n", e.getAddress());
                        System.out.printf("Telepon:\t %s\n", e.getContactNumber());
                        System.out.printf("ID Staf:\t %s\n", e.getStaffId());
                        System.out.printf("Gaji:\t\t %s\n", e.getSalary());
                        System.out.printf("Departemen:\t %s\n", e.getDepartment());
                        System.out.println();
                    }
                    break;
                case "6":
                    System.out.println("Daftar Siswa");
                    for (Student e : daftarStudent) {
                        System.out.printf("Nama:\t\t %s\n", e.getName());
                        System.out.printf("Password:\t %s\n", e.getPassword());
                        System.out.printf("Email:\t\t %s\n", e.getEmail());
                        System.out.printf("Alamat:\t\t %s\n", e.getAddress());
                        System.out.printf("Telepon:\t %s\n", e.getContactNumber());
                        System.out.printf("ID Siswa:\t %s\n", e.getStdId());
                        System.out.println();
                    }
                    break;
                default:
                    isContinue = false;
                    System.out.println("Keluar");
            }
        }
    }

}
