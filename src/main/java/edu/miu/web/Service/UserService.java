package edu.miu.web.Service;

import edu.miu.web.Domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
public interface UserService {


    public Optional<User> findById(Long aLong) ;

    public void save(User user);
    public Iterable<User> findAll() ;

    public void deleteById(Long id) ;

    public void deleteAll() ;
}
