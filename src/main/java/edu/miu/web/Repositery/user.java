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

}
