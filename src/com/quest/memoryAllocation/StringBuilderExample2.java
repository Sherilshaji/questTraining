package com.quest.memoryAllocation;

public class StringBuilderExample2 {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer();
        s1.append("Hello");
        System.out.println("Append method: "+s1);

        System.out.println("Replace method: "+s1.replace(0,3,"w"));

        StringBuffer s2 = new StringBuffer("World");
        System.out.println("Reverse method: "+s2.reverse());

        StringBuffer s3 = new StringBuffer("Hai");
        System.out.println("Delete method: "+s3.delete(0,1));

        StringBuffer s4 = new StringBuffer("World");
        System.out.println("Insert method: "+s4.insert(0,"Hello"));

        System.out.println("Character At method: "+s4.charAt(0));
    }
}
