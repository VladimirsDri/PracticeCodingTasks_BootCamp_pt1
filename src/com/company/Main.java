package com.company;

import java.util.Scanner;

public class Main {
    /* Tasks (practice coding):

1) Ask user to input two numbers, compare them and output result:
   Input:
       Enter value a: 10
       Enter value b: 10
   Expected output:
       is 10 equal to 10? - true
       is 10 less than 10? - false
       is 10 less or equal to 10? - true
       is 10 greater than 10? - false
       is 10 greater or equal to 10? - true

2) Ask user to input two boolean values and compare them.
    Input:
       Enter b1: true
       Enter b2: false
    Expected output:
       Is b1 and b2 equal? - false

3) Ask user to input a whole number and output true, if it is even number and false if it is odd number
    Hint: use remainder operator to divide number by two and get reminder (if reminder is 0 then it means it is even number)-
4) Ask user to input a whole number and output false, if it is even number and true if it is odd number

5) Write a program which reads boolean value from user and prints out the opposite value:
    Example input:
        Enter boolean value: true
    Expected output:
        Opposite of "true" is "false"
6) Write a program which asks the user to input two whole numbers a and b. Output "true", if one of this condition is true:
    1) a and b is equal
    2) a is less than 0 and b is greater than 0
    3) both of them are greater than 100
    otherwise output "false":
    Examples:
        a is -1 and b is -2 -> false
        a is -2 and b is 1 -> true
        a is -1 and b is -1 -> true
        a is 101 and b is 102 -> true
        a is 99 and b is 200 -> false

     */
    //Down below are the solutions for the tasks!

    public static void main(String[] args) {
	//Task 1
        int num1,num2;
        Scanner input = new Scanner(System.in);
        System.out.println("The dear user enter two numbers:");
        num1 = input.nextInt();
        num2 = input.nextInt();
        if(num1==num2){
            System.out.println("is "+ num1 + " equal to "+ num2 +"? - true" );

        }else System.out.println("is "+ num1 + " equal to "+ num2 +"? - false");

        if(num1<num2){
            System.out.println("is "+ num1 + " less than "+ num2 +"? - true");
        }else System.out.println("is "+ num1 + " less than "+ num2 +"? - false");

        if(num1<=num2){
            System.out.println("is "+ num1 + " less or equal to "+ num2 +"? - true");
        }else System.out.println("is "+ num1 + " less or equal to "+ num2 +"? - false");

        if(num1>num2){
            System.out.println("is "+ num1 + " greater than "+ num2 +"? - true");
        }else System.out.println("is "+ num1 + " greater than "+ num2 +"? - false");

        if(num1>=num2){
            System.out.println("is "+ num1 + " greater or equal to "+ num2 +"? - true");
        }else System.out.println("is "+ num1 + " greater or equal to "+ num2 +"? - false");

        //Task 2
        boolean b1,b2;
        System.out.println("The dear user input two booleans values, like true or false");
        System.out.println("Enter b1:" );
        b1 = input.nextBoolean();
        System.out.println("Enter b2:" );
        b2 = input.nextBoolean();
        if(b1==b2){
            System.out.println("Is b1 and b2 equal? - true");
        }else System.out.println("Is b1 and b2 equal? - false");

        //Task 3
        int wholeNum1;
        System.out.println("The dear user input whole number:");
        wholeNum1 = input.nextInt();
        if(wholeNum1%2==0){
            System.out.println("This is even number: true");
        }else System.out.println("This is even number: false");

        //Task 4
        int wholeNum2;
        System.out.println("The dear user input whole number again:");
        wholeNum2 = input.nextInt();
        if(wholeNum2%2!=0){
            System.out.println("This number is odd:true");
        }else System.out.println("This number is odd: false");

        //Task 5
        boolean b3;
        System.out.println("The dear user user input boolean value, like false or true:");
        b3= input.nextBoolean();
        if(b3){
            System.out.println("Opposite of true is false" );
        } else System.out.println("Opposite of false if true");

        //Task 6
        int a,b;
        System.out.println("The dear user input two whole numbers: ");
        a= input.nextInt();
        b= input.nextInt();
        if((a == b) || (a<0 && b>0) || (a>100 && b>100)){
            System.out.println("a is " + a + " and " + "b is "+ b +" -> true");
        }else System.out.println("a is " + a + " and " + "b is "+ b +" -> false");
    }
}
