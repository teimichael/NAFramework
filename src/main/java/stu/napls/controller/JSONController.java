package stu.napls.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import stu.napls.service.UserService;

@Controller
public class JSONController {

	@Resource
	private UserService userService;

	@RequestMapping("/json")
	@ResponseBody
	public Map<String, Object> getUserInfo() {
		List<HashMap<String, Object>> list = this.userService.getUserInfo();
		Map<String, Object> modelMap = new HashMap<String, Object>();
		System.out.println(list.toString());
		modelMap.put("msg", list);
		modelMap.put("success", "true");
		return modelMap;
	}
}
