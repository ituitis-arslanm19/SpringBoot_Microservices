package com.qrent.authorizationserver.repository;

import com.qrent.authorizationserver.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Users,String> {

    Optional<Users> findByUsername(String username);
}
