package behaviorial.observer.guru.listeners;

import java.io.File;

public interface EventListener {

    void update(String eventType, File file);
}
