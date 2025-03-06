package ru.netology.springBootRest.repository;

import org.springframework.stereotype.Repository;
import ru.netology.springBootRest.domain.Authorities;

import java.util.List;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        if (user.equals("admin") && password.equals("qwerty")) {
            return List.of(Authorities.READ, Authorities.WRITE, Authorities.DELETE);
        } else if (user.equals("reader") && password.equals("123")) {
            return List.of(Authorities.READ);
        } else {
            return List.of();
        }
    }
}
