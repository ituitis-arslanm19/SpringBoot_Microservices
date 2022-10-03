package com.qrent.authorizationserver.service;



        import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.Map;
        import javax.annotation.PostConstruct;

        import com.qrent.authorizationserver.model.Users;
        import com.qrent.authorizationserver.repository.UserRepository;
        import lombok.RequiredArgsConstructor;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.security.core.userdetails.User;
        import org.springframework.security.core.userdetails.UserDetails;
        import org.springframework.security.core.userdetails.UsernameNotFoundException;
        import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
        import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {

    final private UsersService usersService;




    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {



            return  usersService.getByUsrName(username).orElseThrow(() -> new UsernameNotFoundException("Username Not Found"));



}}

