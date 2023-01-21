package edu.miu.web.Controler;

import edu.miu.web.Domain.User;
import edu.miu.web.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
@RestController
@RequestMapping("api/v1/users")
@RequiredArgsConstructor
public class UserController {

    public final UserService userservice;

    @RequestMapping("")
    public Optional<User> findById(Long id)
    {
        return userservice.findById(id);
    }


    public Iterable<User> findAll() {
        return userservice.findAll();
    }


    public void deleteById(Long id) {
        userservice.deleteById(id);
    }


    public void deleteAll() {
        userservice.deleteAll();

    }

    @PostMapping
    public void save(@RequestBody User user){
        userservice.save(user);
    }
}
