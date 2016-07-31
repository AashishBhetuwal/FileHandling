/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.Filehandling.StudentDaoImpl.Controller;

import com.leapfrog.Filehandling.Student.Student;
import com.leapfrog.Filehandling.StudentDao.StudentDao;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Toshiba
 */
public class StudentController  {
    private Scanner input;FileWriter filewriter;
    StudentDao studentDao;

    public StudentController(Scanner input, StudentDao studentDao) {
        this.input = input;
        this.studentDao = studentDao;
    }

    private void menu() {
        System.out.println("Student Management System Menu");
        System.out.println("1. Add Student:");
        System.out.println("2. Delete Student");
        System.out.println("3. Search Student by ID");
        System.out.println("4. Show All Students");
        System.out.println("5. Add Students to File");
        System.out.println("6. Exit");
    }

    private void addStudents() {
        System.out.println("Adding Students");

        System.out.println("Adding students:");
        Student s = new Student();
        System.out.println("Please enter Student ID:");
        s.setId(input.nextInt());
        System.out.println("Please enter Name:");
        s.setName(input.next());
        System.out.println("Please enter Address:");
        s.setAddress(input.next());

        System.out.println("Please enter Contact Number:");
        s.setContactno(input.next());
        System.out.println("Please enter Student's level:");
        s.setLevel(input.next());

        if (studentDao.insert(s)) {
            System.out.println("Value Inserted!");
        } else {
            System.out.println("Cannot Insert the value.");
        }

    }

    private void deleteStudents() {
        System.out.print("Enter student id to be deleted: ");
        if (studentDao.delete(input.nextInt())) {
            System.out.println("Student deleted.");
        } else {
            System.out.println("Null Student id. Cannot be deleted. ");
        }
    }

    private void getById() {
        System.out.println("Please enter the student's Id:");
        System.out.println("");

        Student student = studentDao.getById(input.nextInt());
        if (student != null) {
            System.out.println("Student's ID:" + student.getId());
            System.out.println("Student's Name:" + student.getName());
            System.out.println("Student's Contact Number:" + student.getContactno());
            System.out.println("Student's Address:" + student.getAddress());
            System.out.println("Student's Level:" + student.getLevel());
        } else {
            System.out.println("Student could not be found.");
        }
    }

    private void getAll() {
        System.out.println("displaying all the students");
        List<Student> studentlist = studentDao.getAll();
        for (Student s : studentlist) {
            if (studentlist != null) {
                System.out.println("Student's ID:" + s.getId());
                System.out.println("Student's Name:" + s.getName());
                System.out.println("Student's Contact Number:" + s.getContactno());
                System.out.println("Student's Address:" + s.getAddress());
                System.out.println("Student's Level:" + s.getLevel());

            }
        }

    }

    private void fileWrite(FileWriter filewriter) throws IOException{
        BufferedWriter bufferedWriter = new BufferedWriter(filewriter);
        List<Student> studentlist= studentDao.getAll();
        for (Student s : studentlist){
                    bufferedWriter.write("Student ID:"+s.getId() +"\r\n"+"Student Name:"+ s.getName() + "\r\n" + "Address" +s.getAddress()+ "\r\n" +"Level:"+ s.getLevel()+ "\r\n" +"Contact:"+ s.getContactno()+"\r\n");
                    bufferedWriter.newLine();
            }
        System.out.println("Written to File.");
            bufferedWriter.close();
        } 
        
               
        
    
    
    public void process() throws IOException{
        
        try{
           
        filewriter = new FileWriter("C:\\GIT Repository\\student.txt");
        }catch(IOException err){
            System.out.println(err.getMessage());
        }
    while (true) {
            menu();
            int choice = input.nextInt();
            
            switch (choice) {
                case 1:
                    addStudents();
                    break;
                case 2:
                    deleteStudents();
                    break;
                case 3:
                    getById();
                    break;
                case 4:
                    getAll();
                    break;
                case 5:
                    fileWrite(filewriter);
                    break;
                case 6:
                    System.exit(0);
                    filewriter.close();
                    break;
            }
}
    
}
}
