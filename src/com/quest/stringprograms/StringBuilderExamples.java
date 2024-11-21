package com.quest.stringprograms;

public class StringBuilderExamples {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder();
        s1.append("Hello");
        StringBuilder s2 = new StringBuilder();
        s2.append("Hello");

        check(s1, s2);

        predefinedMethod(s1, s2);

    }

    private static void check(StringBuilder s1, StringBuilder s2) {
        if(s1.equals(s2)){
            System.out.println("s1 equals s2");
        }else{
            System.out.println("s1 not equals s2");
        }
        if(s1 == s2){
            System.out.println("s1 == s2");
        }else{
            System.out.println("s1 != s2");
        }
    }

    private static void predefinedMethod(StringBuilder s1, StringBuilder s2) {
        System.out.println("Reverse method: "+ s1.reverse());

        System.out.println("Replace method: "+ s2.replace(0,1,"w"));

        System.out.println("Insert method: "+ s2.insert(0,"w"));

        StringBuilder s3 = new StringBuilder("Hello");
        System.out.println("Delete method: "+s3.delete(0,1));

        System.out.println("Character At method: "+s3.charAt(0));
    }
}
