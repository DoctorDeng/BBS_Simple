package vip.doctordeng.bbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class Login {
	@RequestMapping("/test")
	public String test(){
		return "manage/manage_power";
	}
}
