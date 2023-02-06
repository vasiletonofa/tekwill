package myPackage;

import myPackage2.*;

public class Vasile extends Person {

    private boolean isMale; // false
//    private byte age = 76;

    private char caracter = 'c';
    private byte myNumber = 22;
    private short myNumber1 = 22222;
    private int myNumber2 = 222222222;
    private long price = 2222222222222222222L;
    private float floatNumber = 2222222222222222222222222222222222222.0000000000000000000000F;
    private double price2 = 2;

    private String name; // null
    private Boolean adevarat = true; // new Boolean(true);
    private Double myDouble;  // null

    public void method() {
        myDouble = 2D;
       calculateAge();
    }

    public char getCharacter() {
        return caracter;
    }

    public float getFloatNumber() {
        return floatNumber;
    }

}
