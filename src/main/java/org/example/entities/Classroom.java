package org.example.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name="classroom")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Classroom {

    @Id
    private int id;
    private String name;
    @OneToMany(mappedBy = "classroom", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Students> students;
}
