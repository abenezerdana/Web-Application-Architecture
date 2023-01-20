package edu.miu.web.Service.userserviceImpl;

import edu.miu.web.Domain.User;
import edu.miu.web.Repositery.user;
import edu.miu.web.Service.userservice;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class UserClassImpl implements userservice {
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

}

