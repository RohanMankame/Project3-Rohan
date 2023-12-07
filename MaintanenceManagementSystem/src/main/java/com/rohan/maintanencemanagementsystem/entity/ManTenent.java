package com.rohan.maintanencemanagementsystem.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "ManTenent")
public class ManTenent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "username" , nullable = false)
    private String userName;
    @Column(name = "password" , nullable = false)
    private String password;
    @Column(name = "Phone" , nullable = false)
    private  Long Phone;
    @Column(name = "email" , nullable = false)
    private String email;
    @Column(name = "dateIn" , nullable = false)
    private String DateIn;
    @Column(name = "dateOut" , nullable = false)
    private String DateOut;

    public ManTenent(){

    }
    public ManTenent(String userName, String password, Long Phone, String email, String DateIn, String DateOut) {
        super();

        this.userName = userName;
        this.password = password;
        this.Phone = Phone;
        this.email = email;
        this.DateIn = DateIn;
        this.DateOut = DateOut;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getPhone() {
        return Phone;
    }

    public void setPhone(Long phone) {
        Phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateIn() {
        return DateIn;
    }

    public void setDateIn(String dateIn) {
        DateIn = dateIn;
    }

    public String getDateOut() {
        return DateOut;
    }

    public void setDateOut(String dateOut) {
        DateOut = dateOut;
    }
}
