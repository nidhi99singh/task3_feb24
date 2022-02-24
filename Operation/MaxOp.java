/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operation;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import Connection.connection;
import java.sql.Connection;
/**
 *
 * @author LENOVO
 */


public class MaxOp{

//1. ------- Top 5 employees with max salary 
    public void MaxSalEmp(Connection con) throws SQLException{    
    String str="select * from employee order by salary desc limit 4";
    PreparedStatement stmt= con.prepareStatement(str);
    ResultSet rs=stmt.executeQuery();
    while(rs.next())
    {
    System.out.println("\nEmp_Id:"+rs.getInt(1)+"\nF_name:"+rs.getString(2)+"\nL_name:"+rs.getString(3)+"\nAge:"+rs.getInt(4)+"\nSalary:"+rs.getInt(5)+"\nCity:"+rs.getString(6)+"\nDep_id:"+rs.getInt(7));
    }    
}    
 /*
//2. ------Max Salary----    
 public void ShowMax(Connection con) throws SQLException{    
        String str="Select * from employee where salary=(select Max(salary) from employee)";
        PreparedStatement stmt= con.prepareStatement(str);
        ResultSet rs=stmt.executeQuery();
	while(rs.next())
        {
            System.out.println("\nEmp_Id:"+rs.getInt(1)+"\nF_name:"+rs.getString(2)+"\nL_name:"+rs.getString(3)+"\nAge:"+rs.getInt(4)+"\nSalary:"+rs.getInt(5)+"\nCity:"+rs.getString(6)+"\nDep_id:"+rs.getInt(7));
        }
    }

//3. ------Minimum Salary
public void ShowMin(Connection con) throws SQLException{    
        String str="Select * from employee where salary=(select Min(salary) from employee)";
        PreparedStatement stmt= con.prepareStatement(str);
        ResultSet rs=stmt.executeQuery();
            while(rs.next())
            {
                System.out.println("\nEmp_Id:"+rs.getInt(1)+"\nF_name:"+rs.getString(2)+"\nL_name:"+rs.getString(3)+"\nAge:"+rs.getInt(4)+"\nSalary:"+rs.getInt(5)+"\nCity:"+rs.getString(6)+"\nDep_id:"+rs.getInt(7));
            }
}
//4. ----Total salary 
public void TotalSal(Connection con) throws SQLException{    
        String str="Select sum(salary) from employee";
        PreparedStatement stmt= con.prepareStatement(str);
        ResultSet rs=stmt.executeQuery();
            while(rs.next())
            {
                System.out.println(rs.getInt(1));    
            }    
}
//5. ---Employye Living in X city

public void CityEmp(Connection con,String city) throws SQLException{    
        String str="Select F_name,L_name from employee where city=?";
        PreparedStatement stmt= con.prepareStatement(str);
        stmt.setString(1,city);
        ResultSet rs=stmt.executeQuery();
            System.out.println("Employees living in "+ city +"are:\n");
            while(rs.next())
            {
                System.out.println(rs.getString(1));    
            }    
}

//6. --------------Employees age greater then average age
public void EmpAge(Connection con) throws SQLException{    
        String str="select F_name,L_name from employee where age>(select avg(age) from employee)";
        PreparedStatement stmt= con.prepareStatement(str);
        ResultSet rs=stmt.executeQuery();
        while(rs.next())
        {
                System.out.println(rs.getString(1)+" "+rs.getString(2));    
        }    
}
//7. ---------- Employees in descending order of their salary
public void SalDesc(Connection con) throws SQLException{    
        String str="select F_name,L_name,salary from employee order by salary desc";
        PreparedStatement stmt= con.prepareStatement(str);
        ResultSet rs=stmt.executeQuery();
            while(rs.next())
            {
                System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(3));    
            }    
}
 
public void SalAsc(Connection con) throws SQLException{    
        String str="select F_name,L_name,salary from employee order by salary asc";
        PreparedStatement stmt= con.prepareStatement(str);
        ResultSet rs=stmt.executeQuery();
            while(rs.next())
            {
                System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(3));    
            }    
}

//8. ------------Employee details with depart name    
public void AllEmp(Connection con) throws SQLException{    
        String str="select employee.e_id,employee.F_name,employee.L_name,employee.age,employee.salary,employee.city,employee.dep_id,depart.d_name from employee inner join depart on employee.dep_id=depart.dep_id ";
        PreparedStatement stmt= con.prepareStatement(str);
        ResultSet rs=stmt.executeQuery();
            while(rs.next())
            {
                System.out.println("\nEmp_Id:"+rs.getInt(1)+"\nF_name:"+rs.getString(2)+"\nL_name:"+rs.getString(3)+"\nAge:"+rs.getInt(4)+"\nSalary:"+rs.getInt(5)+"\nCity:"+rs.getString(6)+"\nDep_id:"+rs.getInt(7)+"\nDept Name:"+rs.getString(8));
            }    
}    
   
//9. -------Average salary Dept wise
public void AvgSalDep(Connection con) throws SQLException{    
        String str="select dep_id,avg(salary) AvgSalary from employee group by dep_id; ";
/*
     following query can also be used to display depart name also
     String str="select employee.dep_id,depart.d_name,avg(salary) from employee inner join depart on employee.dep_id=depart.dep_id group by dep_id";
*/

   /* PreparedStatement stmt= con.prepareStatement(str);
        ResultSet rs=stmt.executeQuery();
            while(rs.next())
        {
            System.out.println("\ndep_Id:"+rs.getInt(1)+"\nAvg Salary:"+rs.getDouble(2));
        }    
}*/ 

// 10. -------Employee whose salary is greater than average salary of any department
public void MaxSalDep(Connection con) throws SQLException{    
    String str="select F_name,L_name,salary,dep_id from employee where salary>(select avg(salary) from employee group by dep_id order by salary desc limit 1);";
    PreparedStatement stmt= con.prepareStatement(str);
    ResultSet rs=stmt.executeQuery();
        while(rs.next())
        {
            System.out.println("\nF_name:"+rs.getString(1)+"\nLname:"+rs.getString(2)+"\nSalary:"+rs.getInt(3)+"\ndep_id:"+rs.getInt(4));
        }    
}    
}




