package com.tdd.demo.userservice.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<SUser, Integer> {

    SUser findSUserByUsername(String username);

    void deleteSUserById(int id);





}
