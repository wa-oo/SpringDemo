package cn.taiji.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.taiji.com.domain.User;
import cn.taiji.com.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
	public String findAll(Model model){
	    List<User> list = userService.findAll();
	    model.addAttribute("user",list);
	    return "index";
	 }
	
}
