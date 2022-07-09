package com.kidek.crud.controller;

import com.kidek.crud.model.User;
import com.kidek.crud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/")
public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping(value = "/")
    public String mainPage(ModelMap model) {
        model.addAttribute("userList", userService.getAllUsers());
        return "index";
    }

    @GetMapping(value = "/addUser")
    public String addUserPage(ModelMap model) {
        model.addAttribute("user", new User());
        return "addUser";

    }

    @PostMapping("/addUser")
    public String createUser(@ModelAttribute("user") User user) {


        userService.add(user);
        return "redirect:/";

    }


    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") long id) {
        userService.remove(id);
        return "redirect:/";
    }


    @GetMapping("/editUser/{id}")
        public String editUser(@PathVariable("id") long id, Model model) {

            model.addAttribute("user", new User());
            return "editUser";
        }

        @PostMapping("/editUser/{id}")
        public String editUser(@PathVariable("id") long id, @ModelAttribute("user") User user) {
            user.setId(id);
            userService.edit(user);
            return "redirect:/";
        }
}