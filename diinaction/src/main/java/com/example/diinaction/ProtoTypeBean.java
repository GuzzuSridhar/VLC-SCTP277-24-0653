package com.example.diinaction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") // by default the scope is set to default
public class ProtoTypeBean {
    private int counter = 0;

    public int getCounter() {
        return counter;
    }

    public void setCounter() {
        counter++;
    }

}
