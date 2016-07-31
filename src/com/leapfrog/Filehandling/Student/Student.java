/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.Filehandling.Student;

/**
 *
 * @author Toshiba
 */
public class Student {
     public int id;

    
    public String Name, Address, Level, Contactno;

    public Student() {
    }

    public Student(int id, String Name, String Address, String Level, String Contactno) {
        this.id = id;
        this.Name = Name;
        this.Address = Address;
        this.Level = Level;
        this.Contactno = Contactno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getLevel() {
        return Level;
    }

    public void setLevel(String Level) {
        this.Level = Level;
    }

    public String getContactno() {
        return Contactno;
    }

    public void setContactno(String Contactno) {
        this.Contactno = Contactno;
    }
    
}
