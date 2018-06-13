package cn.taiji.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.taiji.com.service.OrgService;


@Controller
public class OrgController {
	
	@Autowired
	private OrgService orgService;
	
	@RequestMapping("index")
	public String Ssave() {
		return "index";
	}
}
