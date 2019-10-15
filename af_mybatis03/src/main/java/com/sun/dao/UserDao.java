package com.sun.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sun.model.User;

public interface UserDao {
	
	public User getById(int id)throws Exception;
	
	public List<User> get(@Param("tableName")String tableName)throws Exception;
	
	public List<User> find(User user);
}
