package com.example.demo.config;

import org.springframework.batch.core.ItemReadListener;
import org.springframework.stereotype.Component;

@Component
public class ReadListener<T> implements ItemReadListener<T> {
    @Override
    public void beforeRead() {
        System.out.println("Reader Listener :: beforeReadMethod()");
    }

    @Override
    public void afterRead(T t) {
        System.out.println("ReadListener::afterRead()" + t);
    }

    @Override
    public void onReadError(Exception e) {
        System.out.println("ReadListener::onReadError()->" + e.getMessage());
    }
}
