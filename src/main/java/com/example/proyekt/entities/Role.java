package com.example.proyekt.entities;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Table(name="roles")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Role {
    @Id
    @SequenceGenerator(name = "role_id", sequenceName = "role_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "role_id")
    private Integer id;
    private String roleName;

    @OneToMany(mappedBy = "role")
    @JsonBackReference
    private List<User> user;
}