package com.qrent.authorizationserver.service;

import com.qrent.authorizationserver.model.Users;
import com.qrent.authorizationserver.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsersService {

    private final UserRepository userRepository;

    public Optional<Users> getByUsrName(String userName) {
        return userRepository.findByUsername(userName);
    }
}
