package service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.UserInfoMapper;
import pojo.UserInfo;



@Service("userInfoService")
public class UserInfoServiceImpl  implements
		IUserInfoService {
	
	@Autowired
	private UserInfoMapper userinfomapper;
	
	

	@Override
	public UserInfo selectById(Integer id) {
	
		return userinfomapper.selectById(id);
	}
}
