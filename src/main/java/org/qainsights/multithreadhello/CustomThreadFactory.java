package org.qainsights.multithreadhello;

import java.util.UUID;
import java.util.concurrent.ThreadFactory;

public class CustomThreadFactory implements ThreadFactory {
    private String prefix;

 

    public CustomThreadFactory(String prefix) {
        super();
        this.prefix = prefix;
    }

    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setDaemon(false);
        t.setName(this.prefix + UUID.randomUUID().toString());
        return t;
    }

}
