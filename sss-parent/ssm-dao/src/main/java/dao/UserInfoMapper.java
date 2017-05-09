package dao;

import org.apache.ibatis.annotations.Param;

import pojo.UserInfo;


public interface UserInfoMapper {
	
	UserInfo selectById(@Param("id")Integer id);


}