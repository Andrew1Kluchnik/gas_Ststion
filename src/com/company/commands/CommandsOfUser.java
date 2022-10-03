package com.company.commands;

import com.company.entities.User;

public class CommandsOfUser {
    private User money(String answer){
        if(answer == "да"| answer == "yes"| answer == "так"){
          User user = new User();
          return user;
        }
        return null;
    }
}
