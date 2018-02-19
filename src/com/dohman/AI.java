package com.dohman;

import java.util.ArrayList;
import java.util.Random;

public class AI extends Player {

    private ArrayList<String> aiInput;
    private static Random random = new Random();

    public AI() {
        super("AI Dumbom", "O");
        this.aiInput = new ArrayList<String>();
        initialize();
    }

    protected void initialize() {
        aiInput.add("a1");
        aiInput.add("a2");
        aiInput.add("a3");
        aiInput.add("b1");
        aiInput.add("b2");
        aiInput.add("b3");
        aiInput.add("c1");
        aiInput.add("c2");
        aiInput.add("c3");
    }

    @Override
    public String makeInput() {
        int index = random.nextInt(aiInput.size());
        String item = aiInput.get(index);
        return item;
    }
}
