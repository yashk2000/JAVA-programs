public class Teacher {
	String firstName, lastName, dept, staffID;
	String[]coursesAssigned;
	int nc;
	
	public Teacher() {
		firstName = null;
		lastName = null;
		dept = null;
		staffID = null;
		coursesAssigned = null;
		nc = 0;
	}
	
	public Teacher(String fn, String ln, String s, String ID, String[]ca, int n) {
		firstName = fn;
		lastName = ln;
		dept = s;
		staffID = ID;
		coursesAssigned = ca;
		nc = n;
	}
	
	public void printDetails() {
		System.out.println("Name of student: " + firstName + " " + lastName);
		System.out.println("Department: " + dept);
		System.out.println("Staff ID: " + staffID);
		System.out.println("Number of courses assigned: " + nc);
		System.out.println("Courses assigned to the teacher: ");
		for(int i = 0;i < coursesAssigned.length; ++i) {
			System.out.println(coursesAssigned[i]);
		}
	}
}
