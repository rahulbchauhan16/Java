
class Person {
    String name;
    int id;
    int age;

    static class employee {
        String dept;
        int id;

        employee(String dept, int id) {
            this.dept = dept;
            this.id = id;
        }

        public void empdisplay() {
            System.out.println("Department is : " + this.dept);
            System.out.println("Id is : " + this.id);
        }
    }

    Person(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public void display() {
        System.out.println("Name is : " + this.name);
        System.out.println("Name is : " + this.id);
        System.out.println("Name is : " + this.age);
    }
}

class nestedclass {  
    public static void main(String[] args) {
        Person ob = new Person("abc", 11, 25);
        ob.display();
        Person.employee emp = new Person.employee("BCA", 101);
        emp.empdisplay();
    }

}
