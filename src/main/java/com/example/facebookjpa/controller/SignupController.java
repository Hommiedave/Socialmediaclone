package com.example.facebookjpa.controller;

import com.example.facebookjpa.entities.AppUser;
import com.example.facebookjpa.services.AppUserinterface;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping(path = "/facebook")
public class SignupController {
    private final AppUserinterface appUserinterface;



    @RequestMapping(method = RequestMethod.POST, path = "signup")
    public String registerUser(@ModelAttribute("appUser") AppUser appUser ){
        appUserinterface.registerUser(appUser);
        return "login";
    }

    @GetMapping("/signup")
    public String showRegistration(Model model){
        model.addAttribute("appUser", new AppUser());
        return "signup";
    }
@GetMapping("/login")
    public String showLoginForm(Model model) {
        model.addAttribute("appUser", new AppUser());
        return "login";
    }


//    @PostMapping("/welcome")
//    public String LoginUser(@RequestParam("email") String email,@RequestParam("password")String password,
//    HttpSession session,Model model){
//        Optional<AppUser> optionalAppUser= appUserinterface.loginUser(email,password);
//        if (optionalAppUser.isPresent()){
//            AppUser appUser = optionalAppUser.get();
//            session.setAttribute("appuser",appUser);
//            return "redirect/home";
//        }else {
//            model.addAttribute("error","Invalid email or password");
//            return "welcome";
//        }
//    }



}
