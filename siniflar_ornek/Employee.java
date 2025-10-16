package siniflar_ornek;

public class Employee {
	public String name;
	public double salary;
	public int hireYear;
	public int workHours;
	
	// contructor
	Employee(String name, double salary, int hireYear,int workHours){
		this.name = name;
		this.salary = salary;
		this.hireYear= hireYear;
		this.workHours = workHours;
	}
	
	public double Tax_Method(){
		if(this.salary > 1000) {
			return this.salary * 0.03;
		}
		else {
			return 0.0;
		}
	}
	
	public double Bonus_Method(){
		int extra_hours = this.workHours - 40;
		if(extra_hours > 0) {
			return extra_hours * 30;
		}
		return 0.0;
	}
	
	public double RaiseSalary_Method() {
		if(2020-this.hireYear < 10) {
			return this.salary * 0.05;
		}
		else if(2020-this.hireYear > 9 && this.hireYear < 20) {
			return this.salary * 0.1;
		}
		else {
			return this.salary * 0.15;
		}
	}
	
	public void toString(Employee emp) {
		System.out.println("Tax:" + emp.Tax_Method());
		System.out.println("Bonus:" + emp.Bonus_Method());
		System.out.println("Raise of salary:" + emp.RaiseSalary_Method()); 
		
		double totalSalary = emp.salary - emp.Tax_Method()+emp.Bonus_Method();
		System.out.println("Total salary with tax and bonus:" + totalSalary);
		System.out.println("Total salary with raise of salary:" + (emp.salary+emp.RaiseSalary_Method()));
	}
	
	
}
