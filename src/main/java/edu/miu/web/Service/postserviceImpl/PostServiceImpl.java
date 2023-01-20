package edu.miu.web.Service.postserviceImpl;

import edu.miu.web.Domain.Post;
import edu.miu.web.Service.postservice;
import edu.miu.web.Service.userservice;
import jakarta.persistence.EntityManager;

import java.util.List;
import java.util.Optional;
public class PostServiceImpl implements postservice {

    private postservice postservice;
    private userservice userservice;

    private EntityManager entityManager;

    @Override
    public <S extends Post> S save(S entity) {
        return null;
    }

    @Override
    public Optional<Post> findById(Long id) {
        return postservice.findById(id);
    }

    @Override
    public List<Post> findAll() {
        return (List<Post>) postservice.findAll();
    }

    @Override
    public void deleteById(Long id) {
        postservice.deleteById(id);
    }

    @Override
    public void deleteAll() {

        postservice.deleteAll();
    }
}
