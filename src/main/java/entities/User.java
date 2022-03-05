package entities;

import anotation.Column;
import anotation.Entity;
import anotation.Id;

import java.time.LocalDate;

@Entity(name = "user")
public class User {
    @Id
    @Column(name = "id")
    private long id;
    @Column(name = "username")
    private String username;
    @Column(name = "age")
    private int age;
    @Column(name = "registration_date")
    private LocalDate registration;

    public User(String username, int age, LocalDate registration) {
        this.username = username;
        this.age = age;
        this.registration = registration;
    }
    public User(){

    }

    public void setId(long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRegistration(LocalDate registration) {
        this.registration = registration;
    }

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getRegistration() {
        return registration;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", age=" + age +
                ", registration=" + registration +
                '}';
    }
}
