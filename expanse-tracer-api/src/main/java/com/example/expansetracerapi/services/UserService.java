package com.example.expansetracerapi.services;

import com.example.expansetracerapi.domain.User;
import com.example.expansetracerapi.exceptions.EtAuthException;
import org.springframework.stereotype.Service;

public interface UserService {

    User validateUser(String email, String password) throws EtAuthException;

    User registerUser(String fistName, String lastName, String email, String password) throws EtAuthException;


}

