/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.Filehandling;

import com.leapfrog.Filehandling.StudentDao.StudentDao;
import com.leapfrog.Filehandling.StudentDaoImpl.Controller.StudentController;
import com.leapfrog.Filehandling.StudentDaoImpl.StudentDaoImpl;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Toshiba
 */
public class Program{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
       StudentDao studentDao = new StudentDaoImpl();       
        Scanner input = new Scanner(System.in);
        StudentController sc = new StudentController(input, studentDao); 
        sc.process();
        
    }
    
}
