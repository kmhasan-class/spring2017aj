/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.ac.seu.springdemo.controller;

import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author kmhasan
 */
@Controller
public class LoginController {

    @RequestMapping(value = "/authenticate", method = RequestMethod.POST)
    public String authenticate(@RequestParam String username, @RequestParam String password, Model model) {
        System.out.println("Hey I'm here! " + username + " " + password);
        if (username.equals("admin") && password.equals("abc")) {
            model.addAttribute("username", username);
            model.addAttribute("fullname", "Administrator");
            model.addAttribute("loggedin", true);
            model.addAttribute("logintime", new Date());
            return "greeting";
        } else {
            // Take us back to the login page with message that login failed
            // due to incorrect username/password
            // You may want to look into some "th" attirbutes to do switch/cases
            return "failed";
        }
    }
}
