package com.myblog.myblog11.entity;
import jakarta.persistence.*;
import lombok.*;



@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String text;

    private String email;

    // Add a reference to the Post entity
    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;



    // Constructors, getters, and setters
    // ...

}
