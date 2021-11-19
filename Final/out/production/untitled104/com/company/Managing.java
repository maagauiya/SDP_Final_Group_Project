package com.company;


import java.sql.*;
import java.time.LocalDate;
import java.util.Scanner;

public class Managing   {
    Scanner scanner=new Scanner(System.in);
    String connectionUrl="jdbc:postgresql://localhost:5432/final";
    Connection connection=null;
    ResultSet resultSet=null;
    Statement statement=null;
    public void adduser(){
        try {
            Class.forName("org.postgresql.Driver");
            connection= DriverManager.getConnection(connectionUrl,"postgres","loopcool");
            PreparedStatement preparedStatement=connection.prepareStatement("insert into member(id,first_name,last_name,sub_type," +
                    "gym_pass,spa_pass,hamam_pass,due_date) values(?,?,?,?,?,?,?,?)");
            System.out.println("id");
            preparedStatement.setInt(1,scanner.nextInt());
            System.out.println("fname");
            preparedStatement.setString(2,scanner.next());
            System.out.println("lname");
            preparedStatement.setString(3,scanner.next());
            System.out.println("subtype");
            preparedStatement.setString(4,scanner.next());
            //gympass
            System.out.println("gymsize");
            int size=scanner.nextInt();
            Integer[] array = new Integer[size];
            for (int i=0;i<size;i++){
                array[i]=0;
            }
            Array array1 = connection.createArrayOf("Integer", array);
            preparedStatement.setArray(5,array1);
            //spapass
            System.out.println("spasize");
            int size_spa=scanner.nextInt();
            Integer[] array_spa = new Integer[size_spa];
            for (int i=0;i<size_spa;i++){
                array_spa[i]=0;
            }
            Array array_spa1 = connection.createArrayOf("Integer", array_spa);
            preparedStatement.setArray(6,array_spa1);
            //hamampass
            System.out.println("hamamsize");
            int size_hamam=scanner.nextInt();
            Integer[] array_hamam = new Integer[size_hamam];
            for (int i=0;i<size_hamam;i++){
                array_hamam[i]=0;
            }
            Array array_hamam1 = connection.createArrayOf("Integer", array_hamam);
            preparedStatement.setArray(7,array_hamam1);
            LocalDate date= LocalDate.now().plusMonths(3);
            preparedStatement.setObject(8,date);
            preparedStatement.execute();


        }catch (Exception ex){
            System.out.println(ex);
        }
    }
    public void removeuser(){
        try {
            Class.forName("org.postgresql.Driver");
            connection= DriverManager.getConnection(connectionUrl,"postgres","loopcool");
            PreparedStatement preparedStatement=connection.prepareStatement("delete from member where id=?");
            System.out.println("id");
            preparedStatement.setInt(1,scanner.nextInt());
            preparedStatement.execute();
        }catch (Exception ex){
            System.out.println(ex);
        }
    }
    public void update_date(){
        try {
            Class.forName("org.postgresql.Driver");
            connection= DriverManager.getConnection(connectionUrl,"postgres","loopcool");
            PreparedStatement preparedStatement=connection.prepareStatement("update member set due_date=? where id=?");
            System.out.println("date");
            LocalDate date= LocalDate.now().plusMonths(scanner.nextInt());
            preparedStatement.setObject(1,date);
            System.out.println("id");
            preparedStatement.setInt(2,scanner.nextInt());
            preparedStatement.execute();
        }catch (Exception ex){
            System.out.println(ex);
        }
    }
    public void update_premium(){
        try {
            Class.forName("org.postgresql.Driver");
            connection= DriverManager.getConnection(connectionUrl,"postgres","loopcool");
            PreparedStatement preparedStatement=connection.prepareStatement("update member set sub_type=? where id=?");
            System.out.println("type");
            preparedStatement.setString(1,scanner.next());
            System.out.println("id");
            preparedStatement.setInt(2,scanner.nextInt());
            preparedStatement.execute();
        }catch (Exception ex){
            System.out.println(ex);
        }
    }
    public void member_info(){
        try {

            Class.forName("org.postgresql.Driver");
            connection= DriverManager.getConnection(connectionUrl,"postgres","magauiyainc");
            statement=connection.createStatement();
            resultSet=statement.executeQuery("select * from book where state=false");
            while(resultSet.next()){
                System.out.println(resultSet.getInt("id")+" | "+resultSet.getString("first_name"));
            }
        }catch (Exception ex){
            System.out.println(ex);
        }
    }
}
