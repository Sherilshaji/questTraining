package com.quest.exceptionHandling;

import java.net.SocketTimeoutException;
import java.sql.SQLException;

public class TryCatchTest {
    public static void main(String[] args) {

       try{
           getDataFromDatabse("Select * fro m student");
       }catch (Exception e){
           System.out.println(e.getMessage());
       }


//        int i=10;
//        int j=0;
//        try{
//            int result=i/j;
//            System.out.println(result);
//            String str=" select * from student";
//            String result1=String.format(str,1);
//        }catch (Exception e){
//            System.out.println(e);
//        }finally {
//            System.out.println("finally");
//        }
    }
    public static String getDataFromDatabse(String query) throws SocketTimeoutException {
        if(query.equalsIgnoreCase("Select * from student")){
            throw new SocketTimeoutException("Cannot hit the database with the query.");
        }else{
            return "Student";
        }
    }
}
