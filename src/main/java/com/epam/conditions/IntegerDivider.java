package com.epam.conditions;

public class IntegerDivider {

    public void printCompletelyDivided(int dividend, int divider) {
        int res = dividend/ divider;
        int multiplyRes = res * divider;
        if (divider == 0){
            System.out.println("division by zero");
        } else if( multiplyRes == dividend){
            System.out.println("can be divided completely");
        } else {
            System.out.println("cannot be divided completely");
        }
    }

}
