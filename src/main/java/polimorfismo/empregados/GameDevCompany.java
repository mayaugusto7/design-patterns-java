package polimorfismo.empregados;

public class GameDevCompany extends Company {

    @Override
    public Employee[] getEmployees() {
        return new Employee[]{new Designer(), new Artist()};
    }
}
