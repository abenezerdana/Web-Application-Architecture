package edu.miu.web.Domain;


import jakarta.persistence.*;
import jdk.jfr.DataAmount;
import lombok.Data;

@Entity
@Data
public class Post {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        long id;
        String title;
        String content;
        String author;



}
