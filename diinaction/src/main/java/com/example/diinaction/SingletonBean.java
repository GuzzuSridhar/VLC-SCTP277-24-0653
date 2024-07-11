package com.example.diinaction;

import org.springframework.stereotype.Component;

@Component // directs the Spring container to make this class a singleton
public class SingletonBean {
    private int counter = 0;

    public int getCounter() {
        return counter;
    }

    public void setCounter() {
        counter++;
    }
}
