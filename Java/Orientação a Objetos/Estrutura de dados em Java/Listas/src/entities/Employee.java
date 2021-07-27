package entities;

public class Employee {
	
	private Integer id;
	private String name;
	private Double salary;
	
	public Employee() {
	}
	
	public Employee(Integer id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public void increaseSalary(double percentage) {
		salary += salary * percentage /100.0;
	}
	
	@Override   // OVERRIDE ajuda a não errar caso digite o nome da variável errada. Ele vai indicar aonde está o erro!
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}

}
