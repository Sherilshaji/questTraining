package com.quest.practice_vars;

public class PracticeOperators {
    public static void main(String[] args) {
        int a=10;
        int b=5;
//        Arthmetic Operators
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

//        Relational Operators
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println(a<=b);
        System.out.println(a>=b);

        boolean x=true;
        boolean y=false;

//        Logical Operators
        System.out.println(x&&y);
        System.out.println(x||y);
        System.out.println(x!=y);

        int z=10;
//        Assignment Operators
        z+=5;
//        Unary Operator
        System.out.println(z++);
        System.out.println(++z);
        System.out.println(z);
        System.out.println(z--);
        System.out.println(--z);
        System.out.println(z);

        int p=10;
        int q=5;
//        Ternary Operator
        int result=p>15?q++:0;
        System.out.println(result);
    }
}
