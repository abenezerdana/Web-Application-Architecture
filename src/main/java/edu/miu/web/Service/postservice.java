package edu.miu.web.Service;

import edu.miu.web.Domain.Post;
import edu.miu.web.Domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

public interface postservice  {

    public Optional<Post> findById(Long aLong) ;


    public Iterable<Post> findAll() ;

    public void deleteById(Long aLong) ;

    public void deleteAll() ;

}
