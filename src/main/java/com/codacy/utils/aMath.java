package com.codacy.utils;

public class aMath {

    private int magicNumber;

    public aMath(int magicNumber) {
        this.magicNumber = magicNumber;
    }

    /**
     * Adds 2 numbers, unless there is a magic number on the second argument
     */
    public int magicAdd(int x, int y) {
        if (y == magicNumber) {
	    System.out.println("hey2");
            return y - x;
        } else {
            return x + y;
        }
    }
}