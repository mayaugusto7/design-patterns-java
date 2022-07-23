package polimorfismo.alimentos;

public class Principal {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Food fish = new Fish();
        Food sausage = new Sausage();
        cat.eat(fish);
        cat.eat(sausage);
    }
}
