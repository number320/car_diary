package com.example.cardiary;

public class Owner {
    private String name;
    private String mail;

    public Owner(String name, String mail){
        this.name = name;
        this.mail= mail;
    }

    public String getName() {
        return name;
    }

    public String getMail() {
        return mail;
    }
}
