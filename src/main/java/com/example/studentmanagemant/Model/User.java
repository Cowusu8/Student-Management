package com.example.studentmanagemant.Model;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;


@AllArgsConstructor
@Getter
@Setter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
@Slf4j
@Data
@NoArgsConstructor
@Entity
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(length = 128, nullable = false)
    private String title;

    @Column(length = 256)
    private String description;

    @Column(nullable = false)
    private int level;

    @Column
    private boolean published;
}