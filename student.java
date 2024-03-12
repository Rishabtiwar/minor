// Student class
class Student {
    // Instance variables
    private String name;

    // Constructor
    public Student(String name) {
        this.name = name;
    }

    // Getter method for name
    public String getName() {
        return name;
    }


// Main class

    public static void main(String[] args) {
        // Creating a Student object
        Student student = new Student("John Doe");

        // Displaying the student's name
        System.out.println("Student Name: " + student.getName());
    }
}
