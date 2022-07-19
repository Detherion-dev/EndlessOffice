package fr.dawan.endlessoffice.controller;

import fr.dawan.endlessoffice.entities.users.User;
import fr.dawan.endlessoffice.utils.Util;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Objects;

@Controller
public class HomePageController
{
    private static ModelAndView modelAndView;

    @GetMapping("/home")
    public ModelAndView home() {
        modelAndView = new ModelAndView();
        modelAndView.setViewName("home.html");
        return modelAndView;
    }

    @GetMapping("/userLogin")
    public ModelAndView userLogin() {
        modelAndView = new ModelAndView();
        modelAndView.addObject("user", new User());
        modelAndView.setViewName("userLogin.html");
        return modelAndView;
    }

    @PostMapping("/userLogin")
    public ModelAndView userLogSubmit(@ModelAttribute User user) {
        modelAndView = new ModelAndView();
        User dtbUser = Util.getUserRepository().findByEmail(user.getEmail());

        if(dtbUser == null || !Objects.equals(user.getPassword(), dtbUser.getPassword())) {

            modelAndView.setViewName("userLogin.html");
            return modelAndView;
        }

        modelAndView.addObject("user", dtbUser);
        modelAndView.setViewName("loggedIn.html");
        return modelAndView;
    }
}
