package polimorfismo.alimentos;

public class Cat {

    private Integer energy;

    public void eat(Food food) {
        food.getNutrition();
    }

    public Integer getEnergy() {
        return energy;
    }

    public void setEnergy(Integer energy) {
        this.energy = energy;
    }
}
