package org.example.testernghiakun;

import java.util.HashMap;

public class LoginProgram {
    // HASMAP
    public static String login(HashMap<String, String> accounts, String username, String password){
        if(accounts.containsKey(username)){
            String storedPassword = accounts.get(username);
            if(password.equals((storedPassword))){
                return "Login success";
            }else{
                return "Login false";
            }
        }else{
            return "Your accounts was not hoạt động";
        }
    }


}