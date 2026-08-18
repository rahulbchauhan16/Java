class Employee {
    int Employee_ID;
    String Employee_Name;
    String Employee_Designation;
    int Age;
    int Salary;

    public void GetEmployeeDetails(int Employee_ID, String Employee_Name, String Employee_Designation, int Age,
            int Salary) {
        this.Employee_ID = Employee_ID;
        this.Employee_Name = Employee_Name;
        this.Employee_Designation = Employee_Designation;
        this.Age = Age;
        this.Salary = Salary;
    }

    public void DisplayEmployeeDetails() {
        System.out.println("Employee_ID : " + this.Employee_ID);
        System.out.println("Employee_Name : " + this.Employee_Name);
        System.out.println("Employee_Designation : " + this.Employee_Designation);
        System.out.println("Employee_Age : " + this.Age);
        System.out.println("Employee_Salary : " + this.Salary);
    }
}

class employeedetails {
    public static void main(String[] args) {
        Employee ob = new Employee();
        ob.GetEmployeeDetails(11521, "Ram Mohan", "Manager", 27, 45000);
        ob.DisplayEmployeeDetails();
    }

}
