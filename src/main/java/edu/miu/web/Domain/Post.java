package edu.miu.web.Domain;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jdk.jfr.DataAmount;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Post {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        long id;
        String title;
        String content;
        String author;
        @OneToMany(cascade = {CascadeType.MERGE,CascadeType.REMOVE})
        @JoinColumn
        @JsonManagedReference
        List<Comment> comments;



}
