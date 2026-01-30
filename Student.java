class Student {
    String name;
    int roll;
    String course;

    Student() {
        name = "Abhi";
        roll = 39;
        course = "None";
    }

    Student(String n, int r, String c) {
        name = n;
        roll = r;
        course = c;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Jap", 101, "Java");

        System.out.println("Student 1:");
        s1.display();

        System.out.println("\nStudent 2:");
        s2.display();
    }
}
