package com.example.texttrader.db;

import java.util.ArrayList;

public class MockUserData {

    private static ArrayList<User> userList = new ArrayList<>();

    public static ArrayList<User> getUserInfo() {
        return userList;
    }

    public static User getUserInfo(String username) {

        int userStatus = doesUsernameExist(username);

        if (userStatus != -1) {
            for (int i = 0; i < getUserInfo().size(); i++) {

                if (getUserInfo().get(i).equals(username)) {
                    return getUserInfo().get(i);
                }
            }
        }
        return null;
    }

    public static void setUsersInfo() {
        userList.add(new User("admin","Firstadmin","Secondadmin","admin", "Cascadia College"));
        userList.add(new User("Usernumber1","User","Number","Usernumber1", "University of Washington"));
    }

    public static void addNewUser(String username, String user_First_Name, String user_Last_Name, String user_Password, String user_School) {
        userList.add(new User(username, user_First_Name, user_Last_Name, user_Password, user_School));
    }

    public static Integer doesUsernameExist (String username) {

        for (int i = 0; i < getUserInfo().size(); i++) {

            if (getUserInfo().get(i).equals(username)) {
                return i;
            }
        }
        return -1;
    }

    public static Boolean isUsernameAndPasswordCorrect (String username, String password) {

        User tempUser = getUserInfo(username);

        if (tempUser != null) {
            if (tempUser.getUser_Password().equals(password)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
