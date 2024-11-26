package com.quest.practice_vars;

public class ErrorTest {
    private String name;
    public ErrorTest(String test1){
        name = test1;
    }
    public static void main(String[] args) {
        ErrorTest test = new ErrorTest("Test1");
        ErrorTest test2=new ErrorTest("Test2");
        test=null;
//        System.gc();
        test2=null;
//        Runtime.getRuntime().gc();
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("sc called: "+this);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
