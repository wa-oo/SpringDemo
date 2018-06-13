package cn.taiji.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class OrgController {
	@RequestMapping("index")
	public String Ssave() {
		return "index";
	}
}
