package ThirdJune;

class Person {

    int empId;

    Person(int empId) {
        this.empId = empId;
    }

    void display() {
        System.out.println("Employee ID: " + empId);
    }

    public static void main(String[] args) {
        Person p = new Person(101);
        p.display();
    }
}