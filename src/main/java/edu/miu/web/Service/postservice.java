package edu.miu.web.Service;

import edu.miu.web.Domain.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public interface postservice  {
    public <S extends Post> S save(S entity) ;


    public Optional<Post> findById(Long aLong) ;


    public Iterable<Post> findAll() ;

    public void deleteById(Long aLong) ;

    public void deleteAll() ;

}
