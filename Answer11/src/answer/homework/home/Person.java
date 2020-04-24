package answer.homework.home;

/**
 * @author Master_Joe
 *
 */
public class Person {
	private String name = "Default Name";
	private String address;
	private String telphone;
	private String email;

	void setName(String name) {
		this.name = name;
	}

	void setAddress(String address) {
		this.address = address;
	}

	void setTelphone(String telphone) {
		this.telphone = telphone;
	}

	void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getTelphone() {
		return telphone;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + ": " + getName();
	}	
}

class Student extends Person {
	private final String status = "Freshman";
	// private final String status = "Sophomore";
	// private final String status = "Junior";
	// private funal String status = "Senior";

	public String getStatus() {
		return status;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + ": " + getName();
	}
}

class Employee extends Person {
	private String office;
	private double salary;
	private MyDate dateOfApply = new MyDate();

	void setOffice(String office) {
		this.office = office;
	}

	void setSalary(double salary) {
		this.salary = salary;
	}

	public String getOffice() {
		return office;
	}

	public double getSalary() {
		return salary;
	}

	public MyDate getDateOfApply() {
		return dateOfApply;
	}

	void setDateOfApply(MyDate dateOfApply) {
		this.dateOfApply = dateOfApply;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + ": " + getName();
	}
}

class Faculty extends Employee {
	private String officeTime;
	private String grade;

	public String getOfficeTime() {
		return officeTime;
	}

	void setOfficeTime(String officeTime) {
		this.officeTime = officeTime;
	}

	public String getGrade() {
		return grade;
	}

	void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + ": " + getName();
	}
}

class Staff extends Employee {
	private String clerkTitle;

	public String getClerkTitle() {
		return clerkTitle;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + ": " + getName();
	}
}