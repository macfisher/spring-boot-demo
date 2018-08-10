package com.sorclab.controller;

import com.sorclab.domain.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;

@Controller
@RequestMapping("/posts")
public class PostController
{
    @RequestMapping("/")
    public String list(Model model) {
        model.addAttribute("pageTitle", "My Custom Page Title");
        model.addAttribute("posts", createPosts());
        return "views/list";
    }

    private ArrayList<Post> createPosts() {
        // post 1
        Post post1 = new Post();
        post1.setTitle("My Blog Post 1");
        post1.setPosted(new Date());
        post1.setAuthor("Mackenzie Fisher");
        post1.setBody(getPostBody());

        // post 2
        Post post2 = new Post();
        post2.setTitle("My Blog Post 2");
        post2.setPosted(new Date());

    }
}
