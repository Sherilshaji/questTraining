package com.quest.practice_vars;

public class PracticeVars {
    final static int VOTE_AGE=18;
    public static void main(String[] args) {
        int age=18;
        double salary=1000.00;
        char gender='M';
        String firstName="John";
        String lastName="Doe";

        System.out.println("Age= "+age);
        System.out.println("Salary= "+salary);
        System.out.println("Gender= "+gender);
        System.out.println("First Name= "+firstName);
        System.out.println("Last Name= "+lastName);

        age=20;
        System.out.println("Age= "+age);
        System.out.println("Vote age= "+VOTE_AGE);
//        VOTE_AGE=20;It cannot be changed b/c VOTE_AGE is final
        PracticeConversion();
        StringConcatenation();
        StringMethods();
    }
    private static void PracticeConversion(){
        int a=20;
        double b=25.55;
        double sum=a+b;
        int round=(int)b;
        System.out.println("Round= "+round);
    }
    private static void StringConcatenation(){
        String firstName="John";
        String lastName="Doe";
        String s3=firstName+" "+lastName;
        System.out.println(s3);
        int age=22;
        System.out.println("Name= "+s3+" Age= "+age);
    }
    private static void StringMethods(){
        String firstName="John";
        String lastName="JOHN";
        String s3=new String("Hello World");
        String s4=new String("Hello World");
        System.out.println(s3.length());
        System.out.println(s3.equalsIgnoreCase(lastName));
        System.out.println(s3.equals(firstName));
        System.out.println(s4==s3);
        System.out.println(firstName.equals(lastName));
        System.out.println(firstName.equalsIgnoreCase(lastName));
    }

}
