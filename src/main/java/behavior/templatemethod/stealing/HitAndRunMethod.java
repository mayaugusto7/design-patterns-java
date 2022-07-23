package behavior.templatemethod.stealing;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HitAndRunMethod extends StealingMethod {

    @Override
    protected String pickTarget() {
        return "old goblin woman";
    }

    @Override
    protected void confuseTarget(String target) {
        log.info("Approach the {} from behind.", target);
    }

    @Override
    protected void stealTheItem(String target) {
        log.info("Grab the handbag and run away fast!");
    }
}
