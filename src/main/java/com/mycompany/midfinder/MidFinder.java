/*
 * |-------------------------------------------------
 * | Copyright © 2018 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.midfinder;

import org.apache.commons.lang3.StringUtils;

public class MidFinder {
    public int findMidIndex(String input) {

        if (StringUtils.isBlank(input)) {
            throw new IllegalArgumentException();
        }

        return input.length() / 2;
    }
}
