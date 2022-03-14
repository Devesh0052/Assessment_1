package com.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class EmpApp {

	public EmpApp() {
	}
	
	public String createEmp(Emp p) {
		try{ 
			if(EmpDb.db.containsKey(p.getEmpId())) {
			throw new EmployeeExistException("Employee already exists");
			}
		
			else{
			EmpDb.db.put(p.getEmpId(), p);
			return "Employee added";
		}}
			catch(EmployeeExistException e) {
				System.out.println(e);
			}
		return "";
	}
	
	public String findEmp(int empId) {

		if (EmpDb.db.containsKey(empId)) {
			return EmpDb.db.get(empId).getDetails();
		} else {
			return "No Employee found";
		}
	}
	
	public String updateEmp(Emp p) {
		if (EmpDb.db.containsKey(p.getEmpId())) {
			EmpDb.db.put(p.getEmpId(), p);
			return "person updated";
		} else {
			return "Person not found";
		}
	}
	
	public String deleteEmp( int empid) {
		try {
			if(!EmpDb.db.containsKey(empid)) {
				throw new EmpNotFoundException();
			}
			else {
				EmpDb.db.remove(empid);
				return "Employee deleted";
			}
		}catch(EmpNotFoundException e) {
			System.out.println(e);
		}
		return "";
		}
		
		
	
	public List<String> listAll() {

		List<String> employees = new ArrayList<String>();
		Set<Integer> keys = EmpDb.db.keySet();
		
		for (Integer key : keys) {
			Emp p = EmpDb.db.get(key);
				employees.add(p.getDetails());
		}

		return employees;
	}

	

}