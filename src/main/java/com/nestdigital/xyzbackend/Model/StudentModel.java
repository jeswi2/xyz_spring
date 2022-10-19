package com.nestdigital.xyzbackend.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "students")
public class StudentModel {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int rollno;
    private int admno;
    private String college;
    private String department;
    private String blood;
    private String dob;
    private String pa_name;
    private String pa_email;
    private String g_name;
    private String g_address;

    public StudentModel() {
    }

    public StudentModel(int id, String name, int rollno, int admno, String college, String department, String blood, String dob, String pa_name, String pa_email, String g_name, String g_address) {
        this.id = id;
        this.name = name;
        this.rollno = rollno;
        this.admno = admno;
        this.college = college;
        this.department = department;
        this.blood = blood;
        this.dob = dob;
        this.pa_name = pa_name;
        this.pa_email = pa_email;
        this.g_name = g_name;
        this.g_address = g_address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getAdmno() {
        return admno;
    }

    public void setAdmno(int admno) {
        this.admno = admno;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPa_name() {
        return pa_name;
    }

    public void setPa_name(String pa_name) {
        this.pa_name = pa_name;
    }

    public String getPa_email() {
        return pa_email;
    }

    public void setPa_email(String pa_email) {
        this.pa_email = pa_email;
    }

    public String getG_name() {
        return g_name;
    }

    public void setG_name(String g_name) {
        this.g_name = g_name;
    }

    public String getG_address() {
        return g_address;
    }

    public void setG_address(String g_address) {
        this.g_address = g_address;
    }
}
