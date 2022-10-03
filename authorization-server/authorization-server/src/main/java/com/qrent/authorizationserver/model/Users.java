package com.qrent.authorizationserver.model;


import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Collection;
import java.util.UUID;

@ToString
@EqualsAndHashCode
@Table(name="Users")
@Getter
@Setter
@Entity
public class Users extends User {
    @Id
    String id = UUID.randomUUID().toString();

    String username;

    String surname;

    String email;


    public Users(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
    }
}