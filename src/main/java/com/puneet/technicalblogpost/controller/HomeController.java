package com.puneet.technicalblogpost.controller;

import com.puneet.technicalblogpost.model.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
@Controller
public class HomeController {
    @RequestMapping("/getallposts")
    public String getallPosts(Model model){
        ArrayList<Post> posts=new ArrayList<>();
        Post post1=new Post();
        post1.setTitle("Mirzapur");
        post1.setBody("Kaleen bhaiya");
        post1.setDate(new Date());

        Post post2=new Post();
        post2.setTitle("gangs of wassepur");
        post2.setBody("munna bhaiya");
        post2.setDate(new Date());

        Post post3=new Post();
        post3.setTitle("Modi sarkaar");
        post3.setBody("amit shah");
        post3.setDate(new Date());

        posts.add(post1);
        posts.add(post2);
        posts.add(post3);

        model.addAttribute("posts",posts);
        return "index";
    }
}
