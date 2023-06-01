package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int sum = 0;
        int digit;

        for(int i =0; i<4; i++){
            digit = number%10;
            sum = sum + digit;
            number = number/10;
        }
        System.out.println(sum);
    }

}
