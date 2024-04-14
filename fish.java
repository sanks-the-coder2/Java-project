package com.Animals;

import com.interfaces.predator;
import com.interfaces.prey;

public class fish implements prey, predator {
    @Override
    public void hunt() {
        System.out.println("this fish is hunting smaller fishes");
    }

    @Override
    public void flee() {
        System.out.println("this fish is fleeing from bigger fishes");
    }
}
