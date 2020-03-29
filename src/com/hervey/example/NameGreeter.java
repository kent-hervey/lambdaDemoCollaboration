package com.hervey.example;

public class NameGreeter implements MrGreeter {

    @Override
    public String greeting() {
        return "Hello Guest";
    }

    public String greetUser(String name) {
        return "Hello " + name;
    }
}
