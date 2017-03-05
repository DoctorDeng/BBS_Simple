package vip.doctordeng.bbs.dao;

import java.util.List;
import java.util.Map;

import vip.doctordeng.bbs.module.UserModule;

/**
 * 
 * @ClassName:  UserDao   
 * @Description:TODO 用户 DAO
 * @author: DoctorDeng
 * @date:   2017年3月5日 下午12:36:19   
 *
 */
public interface UserDao {
	int insertUser(UserModule userModule);
	int updateUserByCondition(Map condition);
	List<UserModule> listUserByCondition(Map condition);
	UserModule getUserByCondition(Map condition);
}
