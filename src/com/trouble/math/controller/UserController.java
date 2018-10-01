package com.trouble.math.controller;

import com.trouble.math.pojo.QueryVo;
import com.trouble.math.pojo.User;
import com.trouble.math.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    
    @RequestMapping("/login")
    public String login(Model model,QueryVo vo) {
    	User user = vo.getUser();
    	User user1 = userService.findUserById(user.getStudentId());
    	if(user1!=null&&user.getPassword().equals(user1.getPassword())) {
    		model.addAttribute("user", user1);
    		return "redirect:/question/q1.action";
    	}else {
    		model.addAttribute("msg", "用户名或者密码错误");
    		return "login";
    	}
    }






}
