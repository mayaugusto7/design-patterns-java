package polimorfismo.empregados;

public class Artist implements Employee {
    @Override
    public void doWork() {
        System.out.println("I'm great artist");
    }
}
