package edu.miu.web.Service;

import edu.miu.web.Domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface userservice {

    public <S extends User> S save(S entity) ;

    public Optional<User> findById(Long aLong) ;

    public Iterable<User> findAll() ;

    public void deleteById(Long aLong) ;

    public void deleteAll() ;
}
