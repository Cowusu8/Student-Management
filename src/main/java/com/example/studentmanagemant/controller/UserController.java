package com.example.studentmanagemant.controller;


import com.example.studentmanagemant.Model.User;
import com.example.studentmanagemant.dao.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @GetMapping("/users")
    public String getAll(Model model, @Param("keyword") String keyword) {


        return "tutorials";
    }

    @GetMapping("/user/new")
    public String addTutorial(Model model) {


        return "tutorial_form";
    }

    @PostMapping("/user/save")
    public String saveTutorial(User user, RedirectAttributes redirectAttributes) {


        return "redirect:/user";
    }

    @GetMapping("/user/{id}")
    public String editTutorial(@PathVariable("id") Integer id, Model model, RedirectAttributes redirectAttributes) {


        return "user_form";
    }

    @GetMapping("/tutorials/delete/{id}")
    public String deleteTutorial(@PathVariable("id") Integer id, Model model, RedirectAttributes redirectAttributes) {


        return "redirect:/tutorials";
    }

    @GetMapping("/tutorials/{id}/published/{status}")
    public String updateTutorialPublishedStatus(@PathVariable("id") Integer id, @PathVariable("status") boolean published,
                                                Model model, RedirectAttributes redirectAttributes) {

        return "redirect:/tutorials";
    }
}
