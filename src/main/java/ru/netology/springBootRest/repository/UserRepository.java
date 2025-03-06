package ru.netology.springBootRest.repository;

import ru.netology.springBootRest.domain.Authorities;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        return new ArrayList<>();
    }
}
