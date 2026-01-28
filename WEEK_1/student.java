class Student {
    int rollno;
    String name;
    String branch;
    int marks;

    // Method to set data
    void getData(int rollno, String name, String branch, int marks) {
        this.rollno = rollno;
        this.name = name;
        this.branch = branch;
        this.marks = marks;
    }

    // Method to display student details
    void display() {
        System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Branch: " + branch);
        System.out.println("Marks: " + marks);
        System.out.println("----------------------");
    }

    // Main method
    public static void main(String[] args) {
        Student S1 = new Student();
        Student S2 = new Student();

        S1.getData(18, "Spurthi", "CSE", 98);
        S2.getData(19, "Bhavani", "CSE", 92);

        S1.display();
        S2.display();
    }
}