package com.jdc;

public class Operatortest {


    public static void main(String[] args) {
        int marks = 20;

        if (marks >= 80 && marks <= 100) {
            System.out.println("Excellent");

        } else if (marks >= 50 || marks <= 80) {
            System.out.println("Pass");

        }else if (marks >= 0 && marks < 50) {
            System.out.println("Fail");

        }
        else {
            System.out.println("Good");
        }
    }
   }


