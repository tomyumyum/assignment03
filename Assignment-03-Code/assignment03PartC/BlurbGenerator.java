/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: BlurbGenerator.java
 * Author: Java Foundation
 * Author: Duc Ta
 * Author: Tuong Nguyen
 * **********************************************
 */

//import java.lang.*;
//import java.util.*;

package assignment03PartC;

public class BlurbGenerator {
    private final Random generator;

    /**
     * Instantiates a random number generator needed for blurb creation.
     */
    public BlurbGenerator() {
        generator= new Random();
    }

    /**
     * Generates and returns a random Blurb. A Blurb is a Whoozit followed by
     * one or more Whatzits.
     */
    public String makeBlurb() {
        return makeWhoozit() + makeMultiWhatzits();
    }

    /**
     * Generates a random Whoozit. A Whoozit is the character 'x' followed by
     * zero or more 'y's.
     */
    private String makeWhoozit() {
        return "X" + makeYString();
    }

    /**
     * Recursively generates a string of zero or more 'y's.
     */
    private String makeYString() {
        int random = generator.nextInt(5);
        if (random == 0) {
            return "";
        }
        else {
            return "y" + makeYString();
        }
    }

    /**
     * Recursively generates a string of one or more Whatzits.
     */
    private String makeMultiWhatzits() {
        int random = generator.nextInt(5);
        if (random == 0) {
            return "";
        }
        else
        return makeMultiWhatzits() + makeMultiWhatzits();
    }

    /**
     * Generates a random Whatzit. A Whatzit is a 'q' followed by either a 'z'
     * or a 'd', followed by a Whoozit.
     */
    private String makeWhatzit() {
        int random = generator.nextInt(2);
        String blurb = "q";
        if (random == 0){
            blurb += "z";
        }
        else {
            blurb += "d";
        }
        return blurb + makeWhoozit();
    }
}