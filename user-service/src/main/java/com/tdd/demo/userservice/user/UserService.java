package com.tdd.demo.userservice.user;

import java.util.List;

public interface UserService {
    SUser getUserByName(String username);

    int saveUser(SUser user);

    List<SUser> getAllUsers();
}
