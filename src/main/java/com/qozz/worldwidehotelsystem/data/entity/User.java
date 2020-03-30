package com.qozz.worldwidehotelsystem.data.entity;

import com.qozz.worldwidehotelsystem.data.enumeration.Role;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "usr")
@Data
@Accessors(chain = true)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false, length = 100)
    private String username;

    @Column(nullable = false, length = 100)
    private String password;

    @ElementCollection(targetClass = Role.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "usr_role", joinColumns = @JoinColumn(name = "id"))
    @Enumerated(EnumType.STRING)
    private Set<Role> roles;

    @OneToMany(mappedBy = "user")
    private Set<Schedule> schedules;
}
