package edu.miu.web.Repositery;

import edu.miu.web.Domain.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface postrepo extends CrudRepository<Post,Integer> {

}
