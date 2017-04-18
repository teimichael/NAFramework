package stu.napls.dao;

import java.util.HashMap;
import java.util.List;

import stu.napls.model.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);
    
    User selectByUsername(String username);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    List<HashMap<String, Object>> getUserHashMapList();
}