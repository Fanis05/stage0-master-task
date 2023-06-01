package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int revent = 0;
        int temp;
        for (int i = 1; i<=3; i++){
            temp = number%10;
            revent = revent*10+ temp;
            number = number/10;
        }
    }


}
