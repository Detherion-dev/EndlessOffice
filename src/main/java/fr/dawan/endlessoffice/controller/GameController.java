package fr.dawan.endlessoffice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GameController
{
    private static ModelAndView modelAndView;

    @GetMapping("/game")
    public ModelAndView mainMenu()
    {
        modelAndView = new ModelAndView();
        modelAndView.setViewName("game.html");
        return modelAndView;
    }
}
