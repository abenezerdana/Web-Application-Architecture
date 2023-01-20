package edu.miu.web.Repositery;

import edu.miu.web.Domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface user extends CrudRepository<User,Integer> {
}
