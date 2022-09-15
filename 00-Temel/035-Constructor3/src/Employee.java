
public class Employee {
	private String name;
	private double salary;
	private int workHours;
	private int hiredate;

	public Employee(String name, double salary, int workHours, int hiredate) {

		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hiredate = hiredate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getWorkHours() {
		return workHours;
	}

	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}

	public int getHiredate() {
		return hiredate;
	}

	public void setHiredate(int hiredate) {
		this.hiredate = hiredate;
	}
}
