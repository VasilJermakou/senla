/*
 * Copyright (c) Created by Vasil Ermakov
 */

public final class Calculator {

    //constructor
    public Calculator(){}

    //methods

    /**
     * @param a - integer number
     * @param b - integer number
     * return sum of a + b
     * */
    public int sum(int a, int b){
        return a + b;
    }

    /**
     * @param a - integer number
     * @param b - integer number
     * return subtraction of a - b
     * */
    public int subtraction(int a, int b){
        return a - b;
    }

    /**
     * @param a - integer number
     * @param b - integer number
     * return multiply of a * b
     * */
    public int multiply(int a, int b){
        return  a * b;
    }

    /**
     * @param a - integer number
     * @param b - integer number
     * return division of a / b
     * if divide to zero throw ArithmeticException
     * */
    public int division(int a, int b){
        return a / b;
    }

}
