package com.collegedatabase.collegeDatabase.homePage;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String homePage()
    {
        return "This is a College Database Management System. Please use the URL for specific Tasks. See below for more info.";
    }

}
