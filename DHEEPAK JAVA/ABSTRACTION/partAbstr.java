abstract class Employee {
    String name;
    int id;
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    abstract void calculateSalary();
    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }
}
class FullTimeEmployee extends Employee {
    double monthlySalary;
    FullTimeEmployee(String name, int id, double salary) {
        super(name, id);
        this.monthlySalary = salary;
    }
    void calculateSalary() {
        System.out.println("Full-Time Salary: " + monthlySalary);
    }
}
class PartTimeEmployee extends Employee {
    int hoursWorked;
    double ratePerHour;
    PartTimeEmployee(String name, int id, int hours, double rate) {
        super(name, id);
        this.hoursWorked = hours;
        this.ratePerHour = rate;
    }
    void calculateSalary() {
        double salary = hoursWorked * ratePerHour;
        System.out.println("Part-Time Salary: " + salary);
    }
}
public class partAbstr{
    public static void main(String[] args) {
        Employee e;
        e = new FullTimeEmployee("Dheepak", 01, 100000);
        e.displayDetails();
        e.calculateSalary();
        System.out.println();
        e = new PartTimeEmployee("ajay", 02,2, 750);
        e.displayDetails();
        e.calculateSalary();
    }
}