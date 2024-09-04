package org.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name="userinfo")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UserInfo {

    @Id
    private int id;
    private String login;
    private String password;
    private String role;
}
