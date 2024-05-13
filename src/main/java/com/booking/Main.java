package com.booking;

public class Main {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();

        for (int i = 1; i <= 100; i++) {
            System.out.println(i + ": " + fizzBuzz.convert(i));
        }
    }

    static String print(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String output = "";

        for (int i = 1; i <= 100; i++) {
            output += i + ": " + fizzBuzz.convert(i) + "\n";
        }


        return output;



    }
}