/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.Filehandling.StudentDaoImpl;

import com.leapfrog.Filehandling.Student.Student;
import com.leapfrog.Filehandling.StudentDao.StudentDao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Toshiba
 */
public class StudentDaoImpl implements StudentDao{
private List<Student> studentList=new ArrayList<>();
    @Override
    public boolean insert(Student s) {
        return studentList.add(s);
    }

    @Override
    public boolean delete(int id) {
        Student s=getById(id);
        if(s!=null && s.getId()==id)
        {
            return studentList.remove(s);
        }
        return false;
    }

    @Override
    public Student getById(int id) {
        for(Student s:studentList){
            if(s.getId()==id)
            {
                return s;
            }
        }
        return null;
    }

    @Override
    public List<Student> getAll() {
        return studentList;
    }
    
}
