package com.quest.JDBC;

public class DBTester {
    public static void main(String[] args) {
        DBService db=new MySqlDBService();
//        db.createDB();
//        db.createTable();
//        db.insertData();
//        db.deleteData();
        db.updateData();
        db.selectData();
    }
}
