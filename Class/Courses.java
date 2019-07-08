public class Courses {
	String courseName, courseTeacher, courseCode;
	String[]courseStudents;
	int credits;
	
	public Courses(String cn, String ct, String cc, int c, String[]cs) {
		courseName = cn;
		courseTeacher = ct;
		courseCode = cc;
		courseStudents = cs;
		credits = c;
	}
	
	public Courses() {
		courseName = null;
		courseTeacher = null;
		courseCode = null;
		courseStudents = null;
		credits = 0;
	}
	
	public void printNeededDetails(int d) {
		System.out.println("Course name: " + courseName);
		System.out.println("Teacher handling the course: " + courseTeacher);
		System.out.println("Course Code: " + courseCode);
		System.out.println("Course Credits: " + credits);
		System.out.println("Students taking the course: ");
		for(int i = 0; i<courseStudents.length; ++i) {
			System.out.println(courseStudents[i]);
		}		
	}
}
