package dev.kanbantaskmanager.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Builder @Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String userId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false, unique = true)
    private String emailAddress;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String signUpMethod;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<BoardMember> boardMemberships = new HashSet<>();
}
