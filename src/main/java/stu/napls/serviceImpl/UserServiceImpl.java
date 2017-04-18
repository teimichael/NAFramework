package stu.napls.serviceImpl;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import stu.napls.dao.UserMapper;
import stu.napls.model.User;
import stu.napls.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper userDao;

	@Override
	public User getUserById(int id) {
		return userDao.selectByPrimaryKey(id);
	}

	@Override
	public User findUserByUsername(String username) {
		return userDao.selectByUsername(username);
	}

	@Override
	public List<HashMap<String, Object>> getUserInfo() {
		return this.userDao.getUserHashMapList();
	}

}
