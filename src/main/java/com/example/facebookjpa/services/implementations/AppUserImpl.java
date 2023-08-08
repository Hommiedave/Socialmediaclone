package com.example.facebookjpa.services.implementations;

import com.example.facebookjpa.entities.AppUser;
import com.example.facebookjpa.repository.AppUserRepository;
import com.example.facebookjpa.services.AppUserinterface;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class AppUserImpl implements AppUserinterface {

    private final AppUserRepository appUserRepository;


    @Override
    public Optional<AppUser> getUser(Long id) {
        Optional<AppUser> myUser = appUserRepository.findById(id);
        if (myUser.isPresent()){
            AppUser appUser = myUser.get();
        }

        return Optional.empty();
    }

    @Override
    public AppUser registerUser(AppUser appUser) {

        return appUserRepository.save(appUser);
    }


    @Override
    public Optional<AppUser> loginUser(String email, String password) {
        Optional<AppUser> optionalAppUser = appUserRepository.findByEmail(email);
        if (optionalAppUser.isPresent()) {
            AppUser appUser = optionalAppUser.get();
            if (appUser.getPassword().equals(password)) {
                return optionalAppUser; // User found and password matches
            }
        }
        return Optional.empty(); // User not found or password doesn't match
    }

    @Override
    public List<AppUser> getAllUsers() {
        List<AppUser> allUsers = appUserRepository.findAll();
        return allUsers;
    }

    @Override
    public void deleteUser(long id) {

    }


}

