package com.example.proyekt.entities;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Table(name="users")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    @Id
    @SequenceGenerator(name = "user_id", sequenceName = "user_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_id")
    private Integer id;
    private String userName;
    private String userSurname;
    private Integer userAge;

    @ManyToMany
    @JsonManagedReference
    @JoinTable(name="tasks_users",
            joinColumns = @JoinColumn(name="user_id"),
            inverseJoinColumns = @JoinColumn(name="task_id"))
    private List<Task> userTasks;


    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name="role_id")
    private Role role;

}
