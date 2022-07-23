package polimorfismo.empregados;

public class Principal {

    public static void main(String[] args) {
        Company company = new GameDevCompany();
        company.createSoftware();

        Company company2 = new OutsourcingCompany();
        company2.createSoftware();
    }
}
