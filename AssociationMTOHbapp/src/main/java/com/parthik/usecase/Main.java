package com.parthik.usecase;



import org.hibernate.Session;


import com.parthik.beans.Department;
import com.parthik.beans.Employee;
import com.parthik.util.SessionUtil;

public class Main {

	
	public static void main(String[] args) {
		
		Session ses = SessionUtil.getSession();
		
		
		
		//for access the data from database
		
		Employee emp = ses.get(Employee.class, 3);
		
		System.out.println(emp.getDept().getLocation());
		
		
		//=======================================================
		//update or add new Employe
	
//		Department dept = ses.get(Department.class, 2);
//			
//		
//
//		Employee emp = new Employee();
//		emp.setName("Jal");
//		emp.setSalary(24000);
//		emp.setDept(dept);
//		
//		
//		ses.getTransaction().begin();
//		
//		ses.save(emp);
//		
//		ses.getTransaction().commit();
		
		
		//===============================================
		//for storing
		
		
//		Department dept1 = new Department();
//		dept1.setDname("Computer Engineering");
//		dept1.setLocation("Gandhinagar");
//		
//		
//		Employee emp1 = new Employee();
//		emp1.setName("Parthik");
//		emp1.setSalary(10800);
//		
//		emp1.setDept(dept1);
//
//		Employee emp2 = new Employee();
//		emp2.setName("Shubham");
//		emp2.setSalary(34000);
//		
//		emp2.setDept(dept1);
//		
//		
//		Employee emp3 = new Employee();
//		emp3.setName("Rajeshh");
//		emp3.setSalary(50000);
//		
//		emp3.setDept(dept1);
//		
//		
//		ses.getTransaction().begin();
//		
//		ses.save(emp1);
//		ses.save(emp2);
//		ses.save(emp3);
//		
//		ses.getTransaction().commit();
		
		System.out.println("done");
	}
	
}
