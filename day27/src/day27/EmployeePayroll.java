package day27;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayroll {
	 List<EmpPayRollData> empPayRollList =new ArrayList<>();
Scanner sc=new Scanner(System.in);
public void readingDataFromConsole() {
	System.out.println("enter the employee details");
	boolean flag=true;	
	while(flag) {
		System.out.println("enter employee id");
		int id=sc.nextInt();
		System.out.println("enter the emp name");
		sc.nextLine();
		String name=sc.nextLine();
		System.out.println("enter the emp salary");
		float salary=sc.nextFloat();
		System.out.println("If you want to enter the one more employee details type true or else false");
		EmpPayRollData obj=new EmpPayRollData(id, name, salary);
		empPayRollList.add(obj);
		flag=sc.nextBoolean(); 
	}
}
public void EmpPayRollDataToConsole() {
	for(EmpPayRollData data: empPayRollList) {
		System.out.println(data);
	}
}
}
class EmpPayRollData{
	private int id;
	private String name;
	private float salary;
	
	public EmpPayRollData() {
		super();
	}
	public EmpPayRollData(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override	
	public String toString() {
		return "id :"+id+" name : "+name+" salary : "+salary;
	}
	
}

