package com.example.facebookjpa.services;

import com.example.facebookjpa.entities.AppUser;

import java.util.List;
import java.util.Optional;

public interface AppUserinterface {

    Optional<AppUser> getUser(Long id);

    AppUser registerUser (AppUser appUser);
    Optional<AppUser> loginUser(String email, String password);
    List<AppUser>getAllUsers();
    void deleteUser(long id);

}
