package com.shlok.Introduction;

// character into a Object
// java is a pass by value language
public class Wrapper {
    public static void main(String[] args) {
        int a = 10 ;
        int b = 20 ;

        Integer num1 = 30 ; // is an object of Integer class
        Integer num2 = 40 ; // refers to an object of Integer class
        
        swap(a,b);
        swap(num1,num2);
        System.out.println(a + " " + b);
        System.out.println(num1 + " " + num2);
        
    } 

        
    
        static void swap(Integer x , Integer y){ // due to final class we cannot extend it and override the method to change the value of x and y
            Integer temp = x ;
            x = y ;
            y = temp ;
        }
}
