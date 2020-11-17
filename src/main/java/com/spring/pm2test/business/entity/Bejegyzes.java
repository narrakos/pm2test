package com.spring.pm2test.business.entity;

import javax.persistence.*;
import java.sql.Clob;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table(name = "bejegyzes")
public class Bejegyzes {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "profile_id")
    private Profile profile;

    @Column(name = "title")
    private String title;

    @Lob
    @Column(name = "body")
    private Clob body;

    @Column(name = "date_of_creation")
    private LocalDateTime dateOfCreation;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Profile getUser() {
        return profile;
    }

    public void setUser(Profile profile) {
        this.profile = profile;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body.toString();
    }

    public void setBody(String  body) {
        try {
            this.body = new javax.sql.rowset.serial.SerialClob(body.toCharArray());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @PrePersist
    private void setDateOfCreation() {
        this.dateOfCreation = LocalDateTime.now();
    }
}
