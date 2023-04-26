// package org.redfx.javaqc.ch02.hellostrange;

import org.redfx.strange.algorithm.Classic;

public class Main {

    public static void main (String[] args) {
    	int numBits = 16;
    	StringBuffer bitPattern = new StringBuffer();
    	
    	
        for (int i = 0; i < numBits; i++) {
            if (Classic.randomBit() > 0) {
                bitPattern.append("1");
            } else {
            	bitPattern.append("0");
            }
        }
        System.out.println(bitPattern.toString());
        int value = Integer.parseInt(bitPattern.toString(), 2);
        System.out.println(value);
        System.out.printf("%x", value);
    }
}
