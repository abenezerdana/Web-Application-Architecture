package edu.miu.web.Service.userserviceImpl;

import edu.miu.web.Domain.User;
import edu.miu.web.Repositery.user;
import edu.miu.web.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UserClassImpl implements UserService {
@Autowired
    private user users;

    @Override
    public Optional<User> findById(Long id)
    {
        return users.findById(Math.toIntExact(id));
    }

    @Override
    public Iterable<User> findAll() {
        return users.findAll();
    }

    @Override
    public void deleteById(Long id) {
        users.deleteById(Math.toIntExact(id));

    }

    @Override
    public void deleteAll() {
        users.deleteAll();

    }

    @Override
    public void save(User user){
        users.save(user);
    }

}

