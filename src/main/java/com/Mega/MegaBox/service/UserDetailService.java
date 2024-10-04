package com.Mega.MegaBox.service;

import com.Mega.MegaBox.model.LoginRequest;
import com.Mega.MegaBox.model.UserDetailCustom;
import com.Mega.MegaBox.model.UserModel;
import com.Mega.MegaBox.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserDetailService implements UserDetailsService {
    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public UserDetailService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetailCustom loadUserByUsername(String username) throws UsernameNotFoundException {
        UserModel user = userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("Not Found User"));

        return new UserDetailCustom(user);
    }

   public UserModel saveUser(LoginRequest loginRequest){
        UserModel user = new UserModel();
        user.setUsername(loginRequest.getUsername());
        user.setPassword(passwordEncoder.encode(loginRequest.getPassword()));
        user.setUser_role("USER");
        return userRepository.save(user);
   }
}
