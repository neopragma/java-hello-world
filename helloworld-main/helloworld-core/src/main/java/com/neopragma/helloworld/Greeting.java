package com.neopragma.helloworld;

/**
 * Trivial example used in demonstrations and training.
 * @since 1.8
 */
public class Greeting {

    public String greet() {
        return greet("World");
    }

    public String greet(String name) {
        return "Hello, " + name + "!";
    }
}
