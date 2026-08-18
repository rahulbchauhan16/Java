class outerclass {
    int out_id;

    outerclass(int out_id) {
        this.out_id = out_id;
    }

    public void empdisplayouter() {
        System.out.println("Outer class Id is : " + this.out_id);
    }

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
}

class innerclass {
    public static void main(String[] args) {
        outerclass.Person.employee emp = new outerclass.Person.employee("BCA", 101);
        emp.empdisplay();

        outerclass emp1 = new outerclass(1011);
        emp1.empdisplayouter();
    }
}
