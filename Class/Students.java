public class Students {
	String firstName, lastName, rollNumber;
	int age;
	String[]coursesTaken;
	
	public Students(String fn, String ln, String rn, int age, String[]ct) {
		firstName = fn;
		lastName = ln;
		rollNumber = rn;
		this.age = age;
		coursesTaken = ct;
	}
	
	public Students() {
		firstName = null;
		lastName = null;
		rollNumber = null;
		age = 0;
		coursesTaken = null;
	}
	
	public void printDetails() {
		System.out.println("Name of student: " + firstName + " " + lastName);
		System.out.println("Roll number: " + rollNumber);
		System.out.println("Age of students: " + age);
		System.out.println("Courses taken by the student: ");
		for(int i = 0;i < coursesTaken.length; ++i) {
			System.out.println(coursesTaken[i]);
		}
	}	
}
