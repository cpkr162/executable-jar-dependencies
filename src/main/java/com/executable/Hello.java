package com.executable;

import org.apache.commons.lang3.StringUtils;

public class Hello {

    public static void main(String[] args) {

        if (args.length != 2) {
            throw new IllegalStateException("Enter your name and location, please.");
        }

        System.out.printf("Hello %s from %s%n",
                StringUtils.capitalize(args[0]),
                StringUtils.capitalize(args[1]));
    }
}
