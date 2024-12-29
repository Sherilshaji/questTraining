package com.quest.JDBC;

public abstract class DBService {
    abstract void createDB();
    abstract void createTable();
    abstract void insertData();
    abstract void selectData();
    abstract void updateData();
    abstract void deleteData();
}
