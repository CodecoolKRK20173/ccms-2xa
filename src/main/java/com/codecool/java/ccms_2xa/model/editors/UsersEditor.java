package com.codecool.java.ccms_2xa.model.editors;

import com.codecool.java.ccms_2xa.model.records.User;
import java.util.ArrayList;
import java.util.List;

public class UsersEditor {

    protected List<User> userList = new ArrayList<>();

    public List<User> getUserList() {
        return this.userList;
    }

    public void add(User user) {
        this.userList.add(user);
    }

    public void remove(User user) {
        this.userList.remove(user);
    }

    public void editName(String login, String name) {
        getUserByLogin(login).setName(name);
    }

    public void editMail(String login, String mail) {
        getUserByLogin(login).setMail(mail);
    }

    public User getUserByLogin(String login) {
        for(User user : userList) {
            if (user.getLogin().equals(login)) {
                return user;
            }
        }
        return null;
    }

}
