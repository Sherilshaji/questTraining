package com.quest.JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlDBService extends DBService{
    @Override
    void createDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String createSchemaQuery="CREATE SCHEMA IF NOT EXISTS newquest_schema";
        Connection con =null;
        Statement stat =null;
        try {
            con=DatabaseConnection.getConnection();
            stat=con.createStatement();
            stat.executeUpdate(createSchemaQuery);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            if(stat!=null){
                try {
                    stat.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if(con!=null){
                try {
                    con.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    @Override
    void createTable() {
        String useDB="USE newquest_schema";
        String createTable="CREATE TABLE IF NOT EXISTS Persons(PersonID INT,"+"FirstName VARCHAR(255),"+"LastName VARCHAR(255),"+"Address VARCHAR(255),"+"City VARCHAR(255));";
        Connection con =null;
        Statement stat =null;
        try {
            con=DatabaseConnection.getConnection();
            stat=con.createStatement();
            stat.execute(useDB);
            stat.executeUpdate(createTable);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            if(stat!=null){
                try {
                    stat.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if(con!=null){
                try {
                    con.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    @Override
    void insertData() {
        String useDB="USE newquest_schema";
        String insertQuery="INSERT INTO Persons (PersonID, FirstName, LastName, Address, City) VALUES " +
                "(1, 'John', 'Doe', '123 Elm Street', 'New York'), " +
                "(2, 'Jane', 'Smith', '456 Maple Avenue', 'Los Angeles'), " +
                "(3, 'Michael', 'Brown', '789 Oak Drive', 'Chicago'), " +
                "(4, 'Emily', 'Davis', '101 Pine Lane', 'Houston'), " +
                "(5, 'Chris', 'Johnson', '202 Cedar Court', 'Phoenix');";
        Connection con =null;
        Statement stat =null;
        try {
            con=DatabaseConnection.getConnection();
            stat=con.createStatement();
            stat.execute(useDB);
            stat.executeUpdate(insertQuery);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            if(stat!=null){
                try {
                    stat.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if(con!=null){
                try {
                    con.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    @Override
    void selectData() {
        String useDB="USE newquest_schema";
        String selectTable="SELECT DISTINCT * FROM Persons;";
        Connection con =null;
        Statement stat =null;
        try {
            con=DatabaseConnection.getConnection();
            stat=con.createStatement();
            stat.execute(useDB);
            ResultSet rs= stat.executeQuery(selectTable);
            while(rs.next()){
                int personId=rs.getInt("PersonID");
                String firstName=rs.getString("FirstName");
                String lastName=rs.getString("LastName");
                String address=rs.getString("Address");
                String city=rs.getString("City");
                System.out.println("Person ID: "+personId+", First name: "+firstName+", Last name: "+lastName+", Address: "+address+", City: "+city);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            if(stat!=null){
                try {
                    stat.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if(con!=null){
                try {
                    con.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    @Override
    void updateData() {
        String useDB="USE newquest_schema";
        String updateTable="UPDATE Persons SET City='Mexico' WHERE PersonID=4;";
        Connection con =null;
        Statement stat =null;
        try {
            con=DatabaseConnection.getConnection();
            stat=con.createStatement();
            stat.execute(useDB);
            stat.executeUpdate(updateTable);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            if(stat!=null){
                try {
                    stat.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if(con!=null){
                try {
                    con.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    @Override
    void deleteData() {
        String useDB="USE newquest_schema";
        String deleteTable="DELETE FROM Persons WHERE PersonID=5;";
        Connection con =null;
        Statement stat =null;
        try {
            con=DatabaseConnection.getConnection();
            stat=con.createStatement();
            stat.execute(useDB);
            stat.executeUpdate(deleteTable);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            if(stat!=null){
                try {
                    stat.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if(con!=null){
                try {
                    con.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
