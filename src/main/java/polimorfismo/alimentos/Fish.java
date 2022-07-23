package polimorfismo.alimentos;

public class Fish implements Food {

    @Override
    public void getNutrition() {
        System.out.println("I love fish...");
    }
}
