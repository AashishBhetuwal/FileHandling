/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.Filehandling.StudentDao;

import com.leapfrog.Filehandling.Student.Student;
import java.util.List;

/**
 *
 * @author Toshiba
 */
public interface StudentDao {
    
   boolean insert(Student s);
   boolean delete(int id);
   Student getById(int id);
   List<Student> getAll();
}
