package edu.miu.web.Repositery;

import edu.miu.web.Domain.Comment;
import edu.miu.web.Domain.Post;
import edu.miu.web.Domain.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface user extends CrudRepository<User,Integer> {
    List<Post> findAllById(Long id);

    @Query("SELECT users FROM Users users WHERE size( users.posts) >:n")
    public List<User> findAllByPostsGreaterThan(Integer n);

    @Query("SELECT u  FROM Users u join u.posts p WHERE p.title = :name")
    public List<User> findAllByPostsByTitleEquals(String name);


    @Query("select c from Comment c join c.post p join p.users u where u.id= :a and p.id=:b and c.id =:c")

    public Comment findCommentByUserPost(Long a, Long b, Long c);
}
