package edu.uqu.cs;
/*
 * Lab 0 
 * CS 1312
 */

import javax.xml.transform.SourceLocator;
import java.util.Scanner;

/*
* Make sure to complete and submit your lab
*/


public class App{

/**  
* Complete method "twisters" definition below. The method prints all numbers from 1 to 110, 11 numbers per line. 
* Also, it does the following:
* - If the number is a multiple of 2, print "Tweetle"
* - If the number is a multiple of 4, print "Beetle"
* - If the number is a multiple of 6, print "Poodle"
* - Otherwise just print the number
* 
* Output: 
*        1 Tweetle 3 TweetleBeetle 5 TweetlePoodle 7 TweetleBeetle 9 Tweetle 11
*        TweetleBeetlePoodle 13 Tweetle 15 TweetleBeetle 17 TweetlePoodle 19 TweetleBeetle
*/
public static void twisters(){
    for(int i = 1; i <= 110; i++){
        if(i % 2 == 0){
        System.out.print("Tweetle");
        }
        if(i % 4 == 0){
            System.out.print("Beetle");
        }
        if(i % 6 == 0){
            System.out.print("Poodle");
        }
    
        else{
            System.out.print(i);
        }
        
    } 
   


}

/**
* Write a method named "phoneKeypad" that takes a string parameter (str)
* then it replaces each letter in (str) by a number that represnts it 
* in a phone keypad as follows: 
* ABC = 2;
* DEF = 3;
* GHI = 4;
* JKL = 5;
* MNO = 6;
* PQRS = 7;
* TUV = 8; 
* WXYZ = 9
*
* Example:
* Input: calling batman
* Output: 2255464228626
*
*/
public static void phoneKeypad(String str){
    String num = "";
    for (int i = 0; i < str.length(); i++) {
        char letter = str.toUpperCase().charAt(i);
        if(letter >= 'A' && letter <= 'C'){
            num = "2";
            System.out.print(num);
        }else if(letter >= 'D' && letter <= 'F'){
            num = "3";
            System.out.print(num);
        }else if(letter >= 'G' && letter <= 'I' ){
            num = "4";
            System.out.print(num);
        }else if(letter >= 'J' && letter <= 'L'){
            num = "5";
            System.out.print(num);              
        }else if(letter >= 'M' && letter <= 'O'){
            num = "6";
            System.out.print(num);
        }else if(letter >= 'P' && letter <= 'S'){
            num = "7";
            System.out.print(num);
        }else if(letter >= 'T' && letter <= 'V'){
            num = "8";
            System.out.print(num);
        }else if(letter >= 'W' && letter <= 'Z'){
            num = "9";
            System.out.print(num);
        }
        
    }

}
 
    public static void main(String [] args) {
        

        /* Write your code here */
     
       //call method twisters()
       twisters();
       //prompt user to enter a string 
       Scanner scnr = new Scanner(System.in);
       System.out.println("Enter a string to convert it to numbers");
       String str = scnr.nextLine();
       

       //call method phoneKeypad(string)
       phoneKeypad(str) ;


    }

}
