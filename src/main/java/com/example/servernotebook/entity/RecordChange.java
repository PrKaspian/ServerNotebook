package com.example.servernotebook.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "record_changes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecordChange {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @Column(name = "user_id")
    private User user;

    @Column(name = "action")
    private String action;


}
