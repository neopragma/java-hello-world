package com.neopragma.helloworld;

/**
 * Command line driver for the Hello World application.
 * @since 1.8
 */
public class Hello {

    /**
     * @param args - command line arguments
     *
     * arg[0] is the name of the person to greet (optional).
     * If omitted, the default greeting defined in the application will be used.
     */
    public static void main(String[] args) throws Exception {
        Greeting greeting = new Greeting();
        String message = "";
        if (args.length == 0) {
            message = greeting.greet();
        } else {
            message = greeting.greet(args[0]);
        }
        System.out.println(message);
        System.exit(0);
    }
}
