package behaviorial.templatemethod.stealing;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SubtleMethod extends StealingMethod {

    @Override
    protected String pickTarget() {
        return "shop keeper";
    }

    @Override
    protected void confuseTarget(String target) {
        log.info("Approach the {} with tears running and hug him!", target);
    }

    @Override
    protected void stealTheItem(String target) {
        log.info("While in close contact grab the {}'s wallet.", target);
    }
}
