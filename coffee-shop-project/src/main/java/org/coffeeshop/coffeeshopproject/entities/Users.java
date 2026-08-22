package org.coffeeshop.coffeeshopproject.entities;

//users: id, name, email, password, phone, role, created_at

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Locale;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "users")
@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Column(name = "username")
    private String name;

    private String email;

    private String password;

    @Column(name = "user_phone")
    private String phone;

    @Column(name = "user_role")
    private String role;

    private String image_Url;

    @Column(name = "created_at")
    private LocalDateTime created_At;


}
