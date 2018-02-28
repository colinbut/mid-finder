/*
 * |-------------------------------------------------
 * | Copyright © 2018 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.midfinder;

public class MidFinder {
    public int findMidIndex(String input) {
        if (input == null) {
            throw new IllegalArgumentException();
        }

        if ("".equals(input)) {
            throw new IllegalArgumentException();
        }

        return input.length() / 2;
    }
}
