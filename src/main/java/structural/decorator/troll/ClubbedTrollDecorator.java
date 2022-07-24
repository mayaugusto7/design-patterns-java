package structural.decorator.troll;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ClubbedTrollDecorator implements Troll {

    private final Troll decorated;

    public ClubbedTrollDecorator(Troll decorated) {
        this.decorated = decorated;
    }

    @Override
    public void attack() {
      decorated.attack();
      log.info("The troll swings at you with a club!");
    }

    @Override
    public int getAttackPower() {
        return decorated.getAttackPower() + 10;
    }

    @Override
    public void fleeBattle() {
        decorated.fleeBattle();
    }
}
