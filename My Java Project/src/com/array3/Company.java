//sample program to display Employee by using Array
package com.array3;

public class Company {
	public static void main(String[] args) {
		Employee[] employee=new Employee[5];
		employee[0]=new Employee("sherkhan",1,2);
		employee[1]=new Employee("baghira",2,1.2);
		employee[2]=new Employee("Mowgly",3,3.2);
		employee[3]=new Employee("bhalu",4,4.0);
		employee[4]=new Employee("Moti",5,3.2);
		for(int i=0;i<employee.length;i++)
		{
			System.out.println("name:" +employee[i].name+" employee id:"+employee[i].id+" salary:"+employee[i].salary);
		}
		
	}

}
