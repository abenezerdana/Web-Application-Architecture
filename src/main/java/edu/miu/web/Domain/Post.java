package edu.miu.web.Domain;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jdk.jfr.DataAmount;
@Entity
public class Post {
        @Id
        long id;
        String title;
        String content;
        String author;



}
