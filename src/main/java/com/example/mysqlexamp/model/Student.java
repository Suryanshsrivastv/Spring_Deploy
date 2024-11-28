package com.example.mysqlexamp.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    public String name;

    public String subject;

    public int Class;
}
