package com.nestdigital.xyzbackend.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "faculties")
public class FacultyModel {

    @Id
    @GeneratedValue

    private int id;
    private String name;
    private String department;
    private String designation;
    private String dob;
    private String qualification;
    private String address;
    private String number;
    private String doj;

    public FacultyModel() {
    }

    public FacultyModel(int id, String name, String department, String designation, String dob, String qualification, String address, String number, String doj) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.designation = designation;
        this.dob = dob;
        this.qualification = qualification;
        this.address = address;
        this.number = number;
        this.doj = doj;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDoj() {
        return doj;
    }

    public void setDoj(String doj) {
        this.doj = doj;
    }
}
