package com.example.expansetracerapi.services;

import com.example.expansetracerapi.domain.User;
import com.example.expansetracerapi.exceptions.EtAuthException;
import com.example.expansetracerapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.regex.Pattern;

@Service
@Transactional
public class UserServiceImpl  implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public User validateUser(String email, String password) throws EtAuthException {
        return null;
    }

    @Override
    public User registerUser(String fistName, String lastName, String email, String password) throws EtAuthException {
        Pattern pattern = Pattern.compile("^(.+)@(.+)$");
        if (email != null) email = email.toLowerCase();
        if (!pattern.matcher(email).matches())
            throw new EtAuthException("Invalid email format");
        Integer count =  userRepository.getCountByEmail(email);
        if (count>0)
            throw new EtAuthException("Email is alteady in use");
        Integer userId = userRepository.create(fistName, lastName, email,password);

        return userRepository.findById(userId);
    }
}
