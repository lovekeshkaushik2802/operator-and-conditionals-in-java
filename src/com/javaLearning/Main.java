package com.javaLearning;

public class Main {

    public static void main(String[] args) {


        // operators in java = + - * / %

        System.out.println("******* operators and operands in Java ******");

        int mySalary = 30000;
        int houseExpenses = 10000;
        int myTravel = 5000;
        int mySavings     =          mySalary       -          (houseExpenses     +          myTravel);
   //   var varName   operator(=)     operand   operator(-)    (operand        operator(+)   operand );
        System.out.println("my total savings from my jov is  = " + mySavings);

//        mySavings = mySavings - 5000;
//        System.out.println(mySavings);
//
//        mySavings = mySavings *10;
//        System.out.println(mySavings);
//
//        mySavings =  mySavings / 10;
//        System.out.println(mySavings);
//
//        mySavings = mySavings % 3;
//        System.out.println(mySavings);



        // Abbreviating operators *****

        mySavings++;
        System.out.println(mySavings);
        mySavings--;
        System.out.println(mySavings);

        mySavings += 2000;
        System.out.println(mySavings);
        mySavings -= 3000;
        System.out.println(mySavings);
        mySavings *= 3000;
        System.out.println(mySavings);
        mySavings /= 3000;
        System.out.println(mySavings);

        int a = 5;
        int b = 2;
        System.out.println("the sum of a and b is : " + (a+b));
        System.out.println("the sum of a and b is : " + (a-b));
        System.out.println("the sum of a and b is : " + (a*b));
        System.out.println("the sum of a and b is : " + (a/b));
        System.out.println("the sum of a and b is : " + (a%b));

    }
}
