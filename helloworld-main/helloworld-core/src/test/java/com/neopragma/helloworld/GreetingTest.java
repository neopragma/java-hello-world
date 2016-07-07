package com.neopragma.helloworld;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for the Greeting class.
 * @since 1.8
 */
public class GreetingTest {

    private Greeting greeting;

    @Before
    public void beforeEachExample() {
        greeting = new Greeting();
    }

    @Test
    public void whenNoNameIsGiven_itSaysHelloWorld() {
        assertEquals("Hello, World!", greeting.greet());
    }
}
