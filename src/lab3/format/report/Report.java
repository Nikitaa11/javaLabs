package lab3.format.report;

public class Report {
    public static void generateReport(Employee[] employees) {
        System.out.printf("%-20s %5s %n", "name", "salary\n");

        for (Employee employee : employees) {
            System.out.printf("%-20s %,.2f%n", employee.getName(), employee.getSalary());
        }
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("ilya", 59.95);
        employees[1] = new Employee("marik", 45.25);
        employees[2] = new Employee("nekita", 45.78);

        generateReport(employees);
    }
}
