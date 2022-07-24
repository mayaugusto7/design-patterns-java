package behaviorial.templatemethod.orcs;

public abstract class GameAI {

    public final void turn() {
        collectResources();
        buildStructures();
        buildUnits();
        attack();
    }

    public void attack() {}

    public void collectResources() {}

    public abstract void buildStructures();
    public abstract void buildUnits();
}
