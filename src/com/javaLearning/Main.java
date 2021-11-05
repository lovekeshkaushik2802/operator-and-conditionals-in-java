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
        
            // if then statements *************

      boolean isAlive = false;

         if (isAlive){
              System.out.println("you are not alive");
        }System.out.println("you are alive");



        int topScore = 102;
       if (topScore == 100){
           System.out.println("you got high score");
       }


        // and operator
        int newScore = 30;
        if ((topScore > newScore) && (topScore < 200)){
            System.out.println("you got greater then newScore and topScore is less then 200");
        }



        // or operator
        int secondScore = 300;
        if ((secondScore < newScore) || (secondScore < 30)){
            System.out.println("you win");
        }



        // Example of (and) and (or) operator

        int oneNumber = 30;
        int secondNumber = 40;



        if ((oneNumber < 50) && (secondNumber > 50)){
            System.out.println("you are finder");
        }else {
            System.out.println("yu are not finder");
        }



        if ((oneNumber < 50) || (secondNumber > 50)){
            System.out.println("you are the finder");
        }else {
            System.out.println("you are not the finder");
        }


        int newNumber = 20;
        if(newNumber ==20){
            System.out.println("you get 20");

        }

        boolean youCanGo = false;
        if (youCanGo== true){

            System.out.println("you can go");
        }
        

        boolean youCanWork = false;
        if (!youCanWork){
            System.out.println("you can work");
        }

        // **** Ternary operator***********

        int age = 18;
        boolean isOverTwenty = (age==20)? true : false;
        System.out.println(isOverTwenty);


        // example of ternory operator

        double myDouble = 22.00d;
        double myDouble2 = 33.00d;
        double myAddition = myDouble + myDouble2;
        System.out.println("The sum of the double no. is = " + myAddition);
        myAddition -= 10.00d;
        System.out.println("The total after subtracting 10.00 is : " + myAddition);
        myAddition *= 10.00d;
        System.out.println(" the total after multiplisation by 10.00 is =  " + myAddition);
        double newRemainder = myAddition % 4;
        System.out.println("remainder is : " + newRemainder);
        boolean remainderIs = (newRemainder == 0 )? true : false;
        if (remainderIs){
            System.out.println("You got the remainder is " + newRemainder);
        }else {
            System.out.println("you got the remainder is " + newRemainder);

        }

        // ********************* operator challenge **********************

        //1 create a double variable with a value of 20.00
        //2 create a sevond variable of type with thr value 80.00
        //3 add both numbers together and multiply by 100.00
        //4 use the remainder operator to figure out what the remainder from the result of the operation in step 2 and 40.00.
        //  we used the modulus or remainder operator on ints in the course , but we can also use it on a double.
        //5 create a boolean var that assisns the value true if the remainder in step 4 is 0. or false if its not zero
        //6 output the boolean variable
        //7 write an if then statement that displays a message "got some remainder " if the voolean in 5 is not true .


        double myValue1 = 20.00d;
        double myValue2 = 80.00d;

        double addMyValue1And2 = (myValue1 + myValue2)*100;
        System.out.println(addMyValue1And2);
        double myRemainder = addMyValue1And2 % 40.00d;
        System.out.println(myRemainder);

        boolean isNoRemainder = (myRemainder==0) ? true : false;
        System.out.println(isNoRemainder);
        if (isNoRemainder){
            System.out.println("not got some remainder");

        }else {
            System.out.println("got some remainder");
        }



    }
}
