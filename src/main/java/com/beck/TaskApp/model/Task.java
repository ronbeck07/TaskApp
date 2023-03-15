package com.beck.TaskApp.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tasks")


public class Task {



    @Id
    @Column(name = "title")
    String title;

    @Column(name = "date", nullable = false)
    String date;

    @Column(name = "time")
    String time;

    @Column(name = "completed")
    String completed;

}
