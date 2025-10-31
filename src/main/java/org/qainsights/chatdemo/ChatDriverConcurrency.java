package org.qainsights.chatdemo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ChatDriverConcurrency {

    public static void main(String[] args) throws InterruptedException {

//        List<Chat> chatList = new ArrayList<>(); //Fail
        List<Chat> chatList = new CopyOnWriteArrayList<>();
//        chatList.add(new Chat("Hello", LocalDateTime.now()));
//        chatList.add(new Chat("there", LocalDateTime.now()));

//        Thread.sleep(1111);

        ExecutorService ex = Executors.newFixedThreadPool(30);

        for (int i = 0; i < 30; i++) {
            ex.execute(() -> {
                System.out.println(Thread.currentThread().getName());
                chatList.add(new Chat("Hi", LocalDateTime.now()));
            });
            ex.execute(() -> System.out.println(chatList));
            ex.execute(() -> System.out.println(chatList));
            ex.execute(() -> chatList.add(new Chat("there", LocalDateTime.now())));
            ex.execute(() -> System.out.println(chatList));
            ex.execute(() -> chatList.add(new Chat("Hi again", LocalDateTime.now())));


        }

        ex.shutdown();
    }
}
