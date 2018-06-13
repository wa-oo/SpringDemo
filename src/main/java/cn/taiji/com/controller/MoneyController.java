package cn.taiji.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import cn.taiji.com.service.UserService;

@Controller
public class MoneyController {
	
	@Autowired
	private UserService userService;
	
}
