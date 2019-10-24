package com.example.firebasecrud;

public class User {

    String id;
    String name;
    String email;
    String contact;
    String city;
    String lang;

    public User() {
    }

    public User(String id, String name, String email, String contact, String city, String lang) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.contact = contact;
        this.city = city;
        this.lang = lang;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }
}


