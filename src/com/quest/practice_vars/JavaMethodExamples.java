package com.quest.practice_vars;

public class JavaMethodExamples {
    final static int n=10;
    public static void main(String[] args) {
        String s="Hello World";
        int a=5;
        int b=10;
        JavaMethodExamples javaMethodExamples = new JavaMethodExamples();
        javaMethodExamples.display(s);
        int c=javaMethodExamples.add(a,b);
        System.out.println(c);
        System.out.println(n);
    }

    /**
     *
     * @param s - name
     **/

    private void display(String s){
        System.out.println(s);
    }

    /**
     *
     * @param a - number1
     * @param b - number2
     * @return - sum
     */

    private int add(int a,int b){
        return a+b;
    }
}
