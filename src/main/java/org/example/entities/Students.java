package org.example.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="students")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Students {

    @Id
    private int id;
    private String name;
    private String surname;
    private int age;
    private String email;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "classroom_id")
    private Classroom classroom;
}
