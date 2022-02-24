/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Connection.connection;
import Operation.MaxOp;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class main {
    public static void main(String []args) throws SQLException{
       Scanner sc=new Scanner(System.in);
        connection c=new connection();
        c.Createcon();
        MaxOp m=new MaxOp();      
    //first 4 Emp with max salary
       System.out.println("4 Employees with maximum salary:\n");
       m.MaxSalEmp(c.getConnection());
/*    
    //max salary
        System.out.println("Details of Employee having maximum salary:");
        m.ShowMax(c.getConnection());
    
    //min salary
        System.out.println("Details of Employee having minimum salary:");
        m.ShowMin(c.getConnection());
        
    //total salary paid
        System.out.println("total salary paid by Company:");
        m.TotalSal(c.getConnection());
        
    //city employees
        System.out.println("Enter City Name:");
        String city=sc.next();
        m.CityEmp(c.getConnection(), city);
    
    //Age agreater than Average age
        System.out.println("Employees have age more than average age are:\n");
        m.EmpAge(c.getConnection());
    
    // descending order of salary
       System.out.println("Employees in descending order of their salary:\n");
       m.SalDesc(c.getConnection());
       
    //ascending order of salary
       System.out.println("Employees in ascending order of their salary:\n");
       m.SalAsc(c.getConnection());
      
    //All Emp details with depart name
        System.out.println("Employee Details with depart name:\n");
        m.AllEmp(c.getConnection());
    
    //Avg salary Depart wise
        System.out.println("Average Salary Depart wise:\n");
        m.AvgSalDep(c.getConnection());
         
    //Salary greater than average sal of each department
        System.out.println("Employee whose salary is greater than average salary of any department:");
        m.MaxSalDep(c.getConnection());
 */ 
    }
}
