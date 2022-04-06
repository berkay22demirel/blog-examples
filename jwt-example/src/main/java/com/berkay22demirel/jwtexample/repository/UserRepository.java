package com.berkay22demirel.jwtexample.repository;

import com.berkay22demirel.jwtexample.model.User;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Repository
public class UserRepository {

    private Map<Long, User> db = new HashMap<>();

    @PostConstruct
    public void init() {
        db.put(1L, new User(1L, "user", "pw123"));
        db.put(2L, new User(2L, "admin", "pw123."));
    }

    public User findByUsername(String username) {
        return db.values().stream()
                .filter(user -> user.getUsername().equals(username))
                .findFirst()
                .orElseThrow(() -> new UsernameNotFoundException("User nof found!"));
    }
}
