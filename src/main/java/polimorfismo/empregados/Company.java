package polimorfismo.empregados;

public abstract class Company {

    public void createSoftware() {
//        Employee[] employees = { new Designer(), new Programmer(), new Tester()};
//
//        for (Employee e: employees) {
//            e.doWork();
//        }

        Employee[] employees_2 = getEmployees();

        for (Employee e: employees_2) {
            e.doWork();
        }
    }

    public void createSoftware(Employee employee) {
        employee.doWork();
    }

    public abstract Employee[] getEmployees();
}
