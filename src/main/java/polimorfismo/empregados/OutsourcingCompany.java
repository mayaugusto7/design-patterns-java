package polimorfismo.empregados;

public class OutsourcingCompany extends Company {

    @Override
    public Employee[] getEmployees() {
        return new Employee[]{new Programmer(), new Tester()};
    }
}
