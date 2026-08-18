class Student {
    int Enroll_No;
    String Student_Name;
    int Semester;
    double CPI;
    double SPI;

    public void GetStudentDetails(int Enroll_No, String Student_Name, int Semester, double CPI, double SPI) {
        this.Enroll_No = Enroll_No;
        this.Student_Name = Student_Name;
        this.Semester = Semester;
        this.CPI = CPI;
        this.SPI = SPI;
    }

    public void DisplayStudentDetails() {
        System.out.println("Student Enroll : " + this.Enroll_No);
        System.out.println("Student Name : " + this.Student_Name);
        System.out.println("Student Semester : " + this.Semester);
        System.out.println("Student CPI : " + this.CPI);
        System.out.println("Student SPI : " + this.SPI);
    }
}

class studentdata {
    public static void main(String[] args) {
        Student ob = new Student();
        ob.GetStudentDetails(101, "Ram", 3, 9.23, 9.45);
        ob.DisplayStudentDetails();
    }
}
