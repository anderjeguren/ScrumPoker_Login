package com.scrumpoker.login.utils;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
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
    	randomUtil.setSeed(LocalDateTime.now().toInstant(ZoneOffset.UTC).toEpochMilli());
        return Long.toString(randomUtil.nextLong());
    }
}