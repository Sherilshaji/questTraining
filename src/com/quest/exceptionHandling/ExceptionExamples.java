package com.quest.exceptionHandling;

public class ExceptionExamples {
    public static void causeStackOverflow() {
        causeStackOverflow();
    }
    public static void causeOutOfMemory() {
        try{
            int[] arr=new int[Integer.MAX_VALUE];
        }catch (OutOfMemoryError e){
            System.out.println("Out Of Memory: "+e.getMessage());
        }
    }
    public static void main(String[] args) {
        causeOutOfMemory();
        try {
            causeStackOverflow();
        }catch (StackOverflowError e){
            System.out.println("Stack Overflow: ");
            e.printStackTrace();
        }
    }
}
