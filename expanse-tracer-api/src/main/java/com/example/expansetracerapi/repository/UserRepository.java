package com.example.expansetracerapi.repository;

import com.example.expansetracerapi.domain.User;
import com.example.expansetracerapi.exceptions.EtAuthException;

public interface UserRepository {

    Integer create(String firstName, String lastName, String email, String password) throws EtAuthException;

    User findByEmailAndPassword(String email, String password) throws EtAuthException;

    Integer getCountByEmail(String email);
    User findById(Integer userId);
}
