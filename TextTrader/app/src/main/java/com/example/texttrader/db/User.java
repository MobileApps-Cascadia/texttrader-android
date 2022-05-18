package com.example.texttrader.db;

public class User {
    private String Username;
    private String User_First_Name;
    private String User_Last_Name;
    private String User_Password;
    private String User_School;

    public User(String username, String user_First_Name, String user_Last_Name, String user_Password, String user_School) {
        Username = username;
        User_First_Name = user_First_Name;
        User_Last_Name = user_Last_Name;
        User_Password = user_Password;
        User_School = user_School;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getUser_First_Name() {
        return User_First_Name;
    }

    public void setUser_First_Name(String user_First_Name) {
        User_First_Name = user_First_Name;
    }

    public String getUser_Last_Name() {
        return User_Last_Name;
    }

    public void setUser_Last_Name(String user_Last_Name) {
        User_Last_Name = user_Last_Name;
    }

    public String getUser_Password() {
        return User_Password;
    }

    public void setUser_Password(String user_Password) {
        User_Password = user_Password;
    }

    public String getUser_School() {
        return User_School;
    }

    public void setUser_School(String user_School) {
        User_School = user_School;
    }
}
