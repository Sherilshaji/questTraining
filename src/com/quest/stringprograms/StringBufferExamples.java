package com.quest.stringprograms;

public class StringBufferExamples {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer();
        s1.append("Hello");
        StringBuffer s2 = new StringBuffer();
        s2.append("Hello");

        check(s1, s2);

        predefinedMethods(s1, s2);

    }

    private static void predefinedMethods(StringBuffer s1, StringBuffer s2) {
        System.out.println("Reverse method: "+ s1.reverse());

        System.out.println("Replace method: "+ s2.replace(0,1,"w"));

        System.out.println("Insert method: "+ s2.insert(0,"w"));

        StringBuffer s3 = new StringBuffer("Hello");
        System.out.println("Delete method: "+s3.delete(0,1));

        System.out.println("Character At method: "+s3.charAt(0));
    }

    private static void check(StringBuffer s1, StringBuffer s2) {
        if(s1.equals(s2)){
            System.out.println("s1 equals s2");
        }else{
            System.out.println("s1 not equals s2");
        }
        if(s1 == s2){
            System.out.println("s1==s2");
        }else{
            System.out.println("s1!=s2");
        }
    }
}
