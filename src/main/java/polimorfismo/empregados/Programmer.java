package polimorfismo.empregados;

public class Programmer implements Employee {

    @Override
    public void doWork() {
        System.out.println("I'm developer systems");
    }
}
