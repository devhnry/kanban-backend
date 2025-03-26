package dev.kanbantaskmanager.service;

import dev.kanbantaskmanager.repository.AppUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component @RequiredArgsConstructor
public class UserDetailServices implements UserDetailsService {

    private AppUserRepository appUserRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        var userOptional = appUserRepository.findByEmailAddress(username);
        if (userOptional.isPresent()) {
            return userOptional.orElseThrow();
        }
        throw new UsernameNotFoundException("User not found with email + " + username);
    }
}
