package edu.miu.web.Service.userserviceImpl;

import edu.miu.web.Domain.User;
import edu.miu.web.Service.userservice;

import java.util.Optional;

public class UserClassImpl implements userservice {
    @Override
    public <S extends User> S save(S entity) {
        return null;
    }

    @Override
    public Optional<User> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public Iterable<User> findAll() {
        return null;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void deleteAll() {

    }
}
