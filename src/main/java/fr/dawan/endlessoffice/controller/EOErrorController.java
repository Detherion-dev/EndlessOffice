package fr.dawan.endlessoffice.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EOErrorController implements ErrorController
{
    @RequestMapping("/error")
    public String handleError()
    {
        return "error";
    }
}
