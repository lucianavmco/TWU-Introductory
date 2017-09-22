package com.twu.biblioteca;

public class User {

    private int id;
    private String name;
    private String email;
    private String phone;
    private String login;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    private void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLogin() {
        return login;
    }

    private void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    private void setPassword(String password) {
        this.password = password;
    }

    public User(int id, String name, String email, String phone, String login, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.login = login;
        this.password = password;
    }

    public User() {
    }
}
