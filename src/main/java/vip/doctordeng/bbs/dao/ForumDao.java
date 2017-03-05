package vip.doctordeng.bbs.dao;

import java.util.List;
import java.util.Map;

import vip.doctordeng.bbs.module.ForumModule;
/**
 * 
 * @ClassName:  ForumDao   
 * @Description:TODO 版块 DAO
 * @author: DoctorDeng
 * @date:   2017年3月5日 下午12:35:54   
 *
 */
public interface ForumDao {
	int insertForum(ForumModule forumModule);
	int updateForumByCondition(Map condition);
	List<ForumModule> listForumByCondition(Map condition);
	ForumModule getForumByCondition(Map condition);
}
