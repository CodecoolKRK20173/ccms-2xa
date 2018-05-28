package com.codecool.java.ccms_2xa.model;

public abstract class User {

    protected String login;
    protected String password;
    protected String mail;
    protected String name;

    public User(String login, String password, String mail, String name) {
        this.login = login;
        this.password = password;
        this.mail = mail;
        this.name = name;
    }

    public String getLogin() {
        return this.login;
    }

    public String getPassword() {
        return this.password;
    }

    public String getMail() {
        return this.mail;
    }

    public String getName() {
        return this.name;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setName(String name) {
        this.name = name;
    }

}
