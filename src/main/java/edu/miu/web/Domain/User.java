package edu.miu.web.Domain;

import jakarta.persistence.*;
import org.hibernate.engine.internal.Cascade;

import java.util.List;
@Entity(name = "Users")
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String name;
    @OneToMany(cascade = CascadeType.ALL)//acascade all associations
    @JoinColumn(name = "postuserJoin")
    List<Post> posts;

}


