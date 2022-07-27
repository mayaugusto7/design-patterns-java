package behaviorial.observer.guru;

import behaviorial.observer.guru.editor.Editor;
import behaviorial.observer.guru.listeners.EmailNotificationListener;
import behaviorial.observer.guru.listeners.LogOpenListener;

public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@admin.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
