package com.example.gui_assignment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public final class EventSerializer {
    private static final String DATA_PATH = "data.bin";

    public static void serialize(Object[] events) throws IOException {
        ObjectOutputStream serializer = new ObjectOutputStream(new FileOutputStream("data.bin"));

        try {
            serializer.writeObject(events);
        } catch (Throwable var5) {
            try {
                serializer.close();
            } catch (Throwable var4) {
                var5.addSuppressed(var4);
            }

            throw var5;
        }

        serializer.close();
    }

    public static LocalEvent[] deserialize() throws IOException, ClassNotFoundException {
        ObjectInputStream deserializer = new ObjectInputStream(new FileInputStream("data.bin"));

        LocalEvent[] var6;
        try {
            Object[] event = (Object[])deserializer.readObject();
            LocalEvent[] arr = new LocalEvent[event.length];
            int i = 0;

            while(true) {
                if (i >= event.length) {
                    var6 = arr;
                    break;
                }

                arr[i] = (LocalEvent)event[i];
                ++i;
            }
        } catch (Throwable var5) {
            try {
                deserializer.close();
            } catch (Throwable var4) {
                var5.addSuppressed(var4);
            }

            throw var5;
        }

        deserializer.close();
        return var6;
    }

    private EventSerializer() {
    }
}
