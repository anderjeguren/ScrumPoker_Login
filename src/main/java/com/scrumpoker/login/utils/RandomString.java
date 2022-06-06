package com.scrumpoker.login.utils;

import java.time.LocalDate;
import java.util.Random;

// Java program generate a random AlphaNumeric String
// using Math.random() method
  
public class RandomString {
  
    /** Genera string aleatorio
     * @param n Longitud
     * @return String aleatorio
     */
    public static String getAlphaNumericString(int n)
    {
    	Random randomUtil = new Random();
    	randomUtil.setSeed(LocalDate.now().toEpochDay());
        return Long.toString(randomUtil.nextLong());
    }
}