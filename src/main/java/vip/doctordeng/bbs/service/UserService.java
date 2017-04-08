package vip.doctordeng.bbs.service;

import vip.doctordeng.bbs.pojo.entity.UserEntity;

import java.util.Map;

public interface UserService {
	UserEntity getUserById(final Integer userId);
	int checkUserByAccountAndPassword(final String user_account, final String user_password);
	int registerUser(final String user_account, final String user_password, final String user_email);
	int updateUserInfo(final Map dataMap);
}
