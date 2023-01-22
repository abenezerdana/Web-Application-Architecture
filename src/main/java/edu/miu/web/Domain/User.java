package edu.miu.web.Domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.engine.internal.Cascade;

import java.util.List;
@Entity(name = "Users")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String name;
    @OneToMany(cascade = {CascadeType.MERGE, CascadeType.REMOVE})
    @JoinColumn(name = "postuserJoin")
    @JsonManagedReference
    List<Post> posts;
}


