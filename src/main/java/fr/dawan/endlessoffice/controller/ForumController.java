package fr.dawan.endlessoffice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ForumController
{
    private static ModelAndView modelAndView;

    @GetMapping("/forum")
    public ModelAndView forum()
    {
        modelAndView = new ModelAndView();
        modelAndView.setViewName("forum.html");
        return modelAndView;
    }
}
