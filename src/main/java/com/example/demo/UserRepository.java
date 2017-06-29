package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.models.User;

/**
 * Created by student on 6/29/17.
 */
public interface UserRepository extends CrudRepository<User,Long> {
    User findByUsername(String username);
}