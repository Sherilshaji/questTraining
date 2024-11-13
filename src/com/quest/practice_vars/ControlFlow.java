package com.quest.practice_vars;

public class ControlFlow {
    public static void main(String[] args) {
        int number = 10;
        if (number < 0) {
            System.out.println("number is negative " + number);
        } else if (number > 0) {
            System.out.println("number is positive " + number);
        } else {
            System.out.println("number is zero");
        }
        String day = "Monday";
        switch (day) {
            case "Monday":
                System.out.println("Monday");
                break;
            case "Tuesday":
                System.out.println("Tuesday");
                break;
            case "Wednesday":
                System.out.println("Wednesday");
                break;
            case "Thursday":
                System.out.println("Thursday");
                break;
            case "Friday":
                System.out.println("Friday");
                break;
            case "Saturday":
                System.out.println("Saturday");
                break;
            case "Sunday":
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
        testForLoop();
    }
    public static void testForLoop(){
        for(int i=0;i<5;i++){
            if(i%2==0){
                System.out.println("Even number");
            }else{
                continue;
            }
        }
    }
    public static void testWhileLoop(){
        int i=1;
        while(i<=5){
            System.out.println(i);
            i++;
        }
    }
    public static void testDoWhileLoop(){
        int i=1;
        do {
            System.out.println(i);
            i++;
        }
        while(i<=5);
    }
}