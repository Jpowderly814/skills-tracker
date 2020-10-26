package org.launchcode.skillstracker2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.bind.annotation.*;

/**
 * Created by Julie
 */

@Controller

public class SkillsController {

    @GetMapping
    @ResponseBody
    public String skillsTracker() {
        return "<html>" +
                "<h1> Skills Tracker </h1>" +
                "<body>" +

                "<h2>We have a few skills we would like to learn.  Here's the list!</h2> " +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>"+

                "</body>" +
                "</html>";

    }

    @GetMapping("form")
    @ResponseBody
    public String skillsForm(){
        return "<html>" +
                "<h1> Skills Tracker </h1>" +
                "<body>" +
                "<form method = 'post' action= '/form'" +
                "<h2> Name: </h2>" +
                "<input type='text' name='name'/>" +

                "<h2> Favorite programming language:  </h2>" +
                "<select name = 'firstChoice'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select>" +

                "<h2> Second favorite programming language:  </h2>" +
                "<select name = 'secondChoice'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select>" +

                "<h2> Third favorite programming language:  </h2>" +
                "<select name = 'thirdChoice'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select>" +

                "<p></p>" +
                "<input type = 'submit' value = 'Submit'" +
                "</body>" +
                "</html>";
    }

    @PostMapping("form")
    @ResponseBody
    public String skillsFormResults(@RequestParam String name, @RequestParam String firstChoice, @RequestParam String secondChoice, @RequestParam String thirdChoice){
        return
                "<html>" +
                        "<h1>" + name + "</h1>" +
                        "<body>" +
                        "<ol>" +
                        "<li>" + firstChoice + "</li>" +
                        "<li>" + secondChoice + "</li>" +
                        "<li>" + thirdChoice + "</li>" +
                        "</ol>" +
                        "</body>" +
                        "</html>";
    }

}



