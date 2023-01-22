package edu.miu.web.Service.postserviceImpl;

import edu.miu.web.Domain.Post;
import edu.miu.web.Repositery.postrepo;
import edu.miu.web.Service.postservice;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Service
public class PostServiceImpl implements postservice {
@Autowired
    private postrepo postrepo;

    @Override
    public Optional<Post> findById(Long id) {
        return postrepo.findById(Math.toIntExact(id));
    }

    @Override
    public List<Post> findAll() {
        return (List<Post>) postrepo.findAll();
    }

    @Override
    public void deleteById(Long id) {
        postrepo.deleteById(Math.toIntExact(id));
    }

    @Override
    public void deleteAll() {

        postrepo.deleteAll();
    }
}
