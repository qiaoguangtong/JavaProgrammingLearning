package list;

public class Course {
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;

	Course(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	public String[] getStudents() {
		return students;
	}
	
	public void dropStudent(String student) {
		for (int i = 0; i < students.length; i++) {
			if(students[i] == student) {
				students[i] = null;
				for(int j = i + 1; j < students.length; j++ ) {
					students[j-1] = students[j];
					if(students[j] == null)
						break;
				}
				numberOfStudents--;
				return;
			}
		}
	}

}
