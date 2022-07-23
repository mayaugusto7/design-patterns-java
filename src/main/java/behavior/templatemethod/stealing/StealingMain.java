package behavior.templatemethod.stealing;

public class StealingMain {

    public static void main(String[] args) {

        var thief = new HalflingThief(new HitAndRunMethod());
        thief.steal();
        thief.changeMethod(new SubtleMethod());
        thief.steal();
    }
}
