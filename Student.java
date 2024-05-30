/*Write a program to print the names of students by creating a Student class.
	 *  If no name is passed while creating an object of Student class, 
	   then the name should be "Unknown", otherwise the name should be equal 
	   to the String value passed while creating object of Student clas*/
public class Student {

    private String name;

    // Constructor that sets the name
    public Student() {
        this.name = "Unknown";
    }

    public Student(String name) {
        this.name = name;
    }

    // Method to get the name of the student
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        // Creating student objects
        Student student1 = new Student();
        Student student2 = new Student("John");

        // Printing the names of the students
        System.out.println("Student 1 name: " + student1.getName());
        System.out.println("Student 2 name: " + student2.getName());
    }
}
