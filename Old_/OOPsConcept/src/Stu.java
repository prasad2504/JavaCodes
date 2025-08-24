class Stu {

    String studentName;
    int rollNumber;
    static String schoolName = "Unique System Skills";

   
    public void setDetails(String name, int roll) {
        studentName = name;
        rollNumber = roll;
    }

    
    static public void displaySchoolName() {
        System.out.println("School: " + schoolName);
    }

    
    void displayDetails() {
       
        displaySchoolName();
        System.out.println("Student Name: " + studentName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println(); 
    }
}


