package dev.kanbantaskmanager.entities;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String boardId;

    @Column(unique = true, nullable = false)
    private String boardName;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private AppUser owner;

    @OneToMany(mappedBy = "board", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<BoardMember> members = new HashSet<>();
}
