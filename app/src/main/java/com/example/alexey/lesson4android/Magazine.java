package com.example.alexey.lesson4android;

import java.util.ArrayList;
import java.util.List;

public class Magazine {

    private String name, address, login;
    public static List<Magazine> MagazineList = new ArrayList<>();

    public Magazine(String name, String address, String login) {
        this.name = name;
        this.address = address;
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddres(String addres) {
        this.address = addres;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
