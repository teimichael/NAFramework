package stu.napls.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import stu.napls.base.Data;
import stu.napls.model.User;
import stu.napls.service.UserService;

@Controller
public class JSONController {

	@Resource
	private UserService userService;

	@RequestMapping("/json")
	public @ResponseBody Data getUserInfo() {
		List<User> list = this.userService.getUserInfo();
		return Data.success(list);
	}
}
