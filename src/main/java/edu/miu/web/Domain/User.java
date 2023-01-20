package edu.miu.web.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

import java.util.List;
@Entity
public class User {
@Id
    long id;
    String name;
    @OneToMany
    @JoinColumn(name = "postuserJoin")
    List<Post> posts;

}


