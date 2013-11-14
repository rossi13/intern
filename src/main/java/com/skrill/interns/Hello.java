package com.skrill.interns;

import java.io.IOException;

public class Hello {

    public static void main (String [] s) {
        byte [] name = new byte [256];
        try {
            System.in.read(name);
            System.out.println("Hello, dear " + new String(name));
        } catch (IOException e) {
            System.out.println("cannot read input, " + e.getMessage());
        }
    }

}
