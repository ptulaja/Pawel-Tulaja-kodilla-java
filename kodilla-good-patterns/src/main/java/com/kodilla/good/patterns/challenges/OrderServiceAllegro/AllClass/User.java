package com.kodilla.good.patterns.challenges.OrderServiceAllegro.AllClass;

public class User {

    private String login;
    private String name;
    private String surname;
    private String address;

    public User(String login, String name, String surname, String address) {
        this.login = login;
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public String getLogin() {
        return login;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }
}
