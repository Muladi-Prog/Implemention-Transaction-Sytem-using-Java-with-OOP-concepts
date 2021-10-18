package Utama;

import java.util.UUID;
import java.util.Vector;

public  class Chef extends Details {
	
	String username;
	String gender;
	int age;
	private int Salary = 3000;
	public boolean Status;

	
	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	

	public Chef(UUID id, String username, String name, String gender, int age,boolean status) {
		super(id,name);
		this.username = username;
		this.gender = gender;
		this.age = age;
	
		this.Status = status;
	}

	public Chef() {
		// TODO Auto-generated constructor stub
	}

	


	
	public void showDetails(Vector<Chef> chef) {
			for (Chef a : chef) {
				System.out.println(a.id);
				System.out.println("==========================");
				System.out.println("Name	: "+a.Name);
				System.out.println("Username: "+a.username);
				System.out.println("Age     : "+a.age);
				System.out.println("Gender	: "+a.gender);
				System.out.println();
			
		}
	
	}

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		
	}

}
