package com.ozgulsu.javalearning;

public class Statements {
    public static void main(String[] args){


        int x = 5;
        System.out.println(x);
        x = x + 1;
        System.out.println(x);
        x++;
        System.out.println(x);
        x = x * 5;
        System.out.println(x);

        int y = 4;

        System.out.println(x>y);

        System.out.println(y>x);

        y = 50;

        System.out.println(x>y);

        System.out.println(x==y);

        System.out.println(x!=y);
        // and &&  or ||

        x = 30;
        y = 4;
        int z = 5;

        System.out.println( );
        System.out.println(x<y && y<z);
        System.out.println(x>y || z<y);
        System.out.println("----------------------------------");

        //If statements

        if(x<y){
            System.out.println("y is bigger");
        } else if(y<x){
            System.out.println("x is bigger");
        }else {
            System.out.println("x=y");
        }

        //switch

        int day =1;
        String dayString = "";

        if(day==1){
            dayString = "Monday";
        }else if(day==2){
            dayString = "Tuesday";
        }else{
            dayString = "Wednesdey";
        }
        System.out.println(dayString);

        day = 2;

        switch (day){
            case 1:
                dayString = "Monday";
                break;
            case 2:
                dayString = "Tuesday";
                break;
            default:
                dayString = "Wednesday";
                break;
        }
        System.out.println(dayString);







    }
}
