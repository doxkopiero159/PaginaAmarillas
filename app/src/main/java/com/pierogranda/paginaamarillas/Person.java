package com.pierogranda.paginaamarillas;



public class Person {



    private Integer id;

    private String fullname;

    private String email;

    private String picture;

    public Person(Integer id) {
        this.setId(id);
    }

    public Person(int id, String juan_perez, String s, String jperez) {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                ", email='" + email + '\'' +
                ", picture='" + picture + '\'' +
                '}';
    }


}


