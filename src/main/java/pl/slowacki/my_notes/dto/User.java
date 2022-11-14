package pl.slowacki.my_notes.dto;

import java.util.Objects;

public class User
{
    private String name;
    private int age;
    private String login;
    private String creationDate;

    public User(String name, int age, String login) {
        this.name = name;
        this.age = age;
        this.login = login;
    }

    public User() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User uSer = (User) o;
        return age == uSer.age && Objects.equals(name, uSer.name) && Objects.equals(login, uSer.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, login);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public User(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
}
