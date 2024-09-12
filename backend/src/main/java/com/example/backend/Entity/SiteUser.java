package com.example.backend.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
public class SiteUser {
    @Id
    @Column(length = 24)
    @Setter(AccessLevel.NONE)
    private String username;

    @Column(columnDefinition = "TEXT")
    private String password;

    @Builder
    public SiteUser(String username, String password){
        this.username = username;
        this.password = password;
    }
}
