package stu.napls.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import stu.napls.model.User;
import stu.napls.utils.CipherUtil;

@Controller
public class LoginController {

	/**
	 * 初始登陆界面
	 * 
	 * @param request
	 * @return String
	 */
	@RequestMapping("/login")
	public String tologin(HttpServletRequest request) {
		// System.out.println("来自IP[" + request.getRemoteHost() + "]的访问");
		return "login";
	}

	/**
	 * 验证用户名和密码
	 * 
	 * @param request
	 * @return String
	 */
	@RequestMapping("/checkLogin")
	public String login(@ModelAttribute("user") User user) {
		String result = "login";
		// 取得用户名
		String username = user.getUsername();
		// 取得 密码，并用MD5加密
		String password = CipherUtil.generatePassword(user.getPassword());

		UsernamePasswordToken token = new UsernamePasswordToken(username, password);

		Subject currentUser = SecurityUtils.getSubject();
		try {
			if (!currentUser.isAuthenticated()) {// 使用shiro来验证
				token.setRememberMe(true);
				currentUser.login(token);// 验证角色和权限
			}
			result = "index";// 验证成功
		} catch (Exception e) {
			e.printStackTrace();
			result = "failure";// 验证失败
		}
		return result;
	}

	/**
	 * 退出
	 * 
	 * @param
	 * @return String
	 */
	@RequestMapping(value = "/logout")
	@ResponseBody
	public String logout() {

		Subject currentUser = SecurityUtils.getSubject();
		currentUser.logout();
		return "logout";
		//TODO redirect
	}

}
